package com.lti.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dto.StatusDto;
import com.lti.dto.StatusDto.StatusType;
import com.lti.model.Otp;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;
import com.lti.repository.PolicyRepository;
import com.lti.repository.UserRepository;

import ch.qos.logback.core.status.Status;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PolicyRepository policyRepository;

	@Autowired
	EmailService emailService;

	public User addorUpdateUser(User user) {
		User newUser = new User();
		try {
			newUser = userRepository.addorUpdateUser(user);
		} catch (Exception e) {
			Throwable t = e.getCause();
			while ((t != null) && !(t instanceof ConstraintViolationException)) {
				t = t.getCause();
			}
			if (t instanceof ConstraintViolationException) {
				throw new IllegalArgumentException("Email-id already registered");
			}
			return null;
		}

		if(newUser.getUserId()>0) {
			String subject ="Registraion successful!";
			String email=newUser.getEmail();
			
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("Name", newUser.getName());
			m.put("dob", newUser.getDateOfBirth().toString());
			m.put("mobileNo", newUser.getMobileNumber());
			m.put("address", newUser.getAddress());
			emailService.sendEmail(email, subject, m, "registration.ftl");
			System.out.println("email sent");
		}
		return newUser;
	}

	public Policy addPolicyToUser(Plan plan, Vehicle vehicle, int userId) {
		Policy policy = userRepository.addPolicyToUser(plan, vehicle, userId);
		
		if(policy!=null)
		if(policy.getUser()!=null) {
			String subject ="Policy succesfully added";
			String email=policy.getUser().getEmail();
			
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("Name", policy.getUser().getName());
			m.put("policyId", policy.getPolicyId());
			m.put("planType", policy.getPlan().getPlanType());
			m.put("exprDate", policy.getExpiryDate());
			m.put("manufacturer", policy.getVehicle().getManufacturer());
			m.put("model", policy.getVehicle().getVehicleModel());
			StatusDto emailStatusDto = emailService.sendEmail(email, subject, m, "new-policy.ftl");
			if (emailStatusDto.getStatus()==StatusType.FAILED)
			System.out.println(emailStatusDto.getMessage());
			
			return policy;
		}
		
		return null;
	}

	@Override
	public User validateUserLogin(String emailId, String password) {
		return userRepository.validateUserlogin(emailId, password);
	}

	public Policy findPolicyById(int policyId) {
		return userRepository.findPolicyById(policyId);
	}

//	public Plan renewPolicyByUser(int userId,int policyId,Plan plan) {
//        return userRepository.renewPolicyByUser(userId, policyId, plan);
//	}

	public StatusDto renewPolicy(int policyId, String planType) {
		StatusDto dto = new StatusDto();
		dto.setStatus(StatusType.FAILED);
		Policy policy = policyRepository.getPolicyById(policyId);
		if (policy == null) {
			dto.setMessage("policy with id "+policyId+" does not exist");
			return dto;
		}
		
		if (!policy.getExpiryDate().isBefore(LocalDate.now())) {
			dto.setMessage("policy with id "+policyId+" has not expired");
			dto.setStatus(StatusType.FAILED);
			return dto;
		}
		policy = userRepository.renewPolicy(policyId, planType);
		
		if(policy.getUser()!=null) {
			String subject ="Renewal successful";
			String email=policy.getUser().getEmail();
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("Name", policy.getUser().getName());
			m.put("policyId", policy.getPolicyId());
			m.put("planType", policy.getPlan().getPlanType());
			m.put("exprDate", policy.getExpiryDate());
			m.put("manufacturer", policy.getVehicle().getManufacturer());
			m.put("model", policy.getVehicle().getVehicleModel());
			StatusDto emailStatusDto = emailService.sendEmail(email, subject, m, "renew-policy.ftl");
			
//			if (emailStatusDto.getStatus()==StatusType.FAILED)
			System.out.println(emailStatusDto.getMessage());
		}
		
		
		dto.setStatus(StatusType.SUCCESS);
		dto.setMessage("policy with id "+policyId+" renewed till "+policy.getExpiryDate().toString());
		return dto;
	}
	
	public StatusDto checkIfEmailExists(String emailId) {
		StatusDto dto = new StatusDto();
		User user = userRepository.getUserByEmailId(emailId);
		if (user!=null) {
			dto.setMessage("email exists in records");
			dto.setStatus(StatusType.SUCCESS);
			return dto;
		}
		dto.setMessage("does not exist in records");
		dto.setStatus(StatusType.FAILED);
		return dto;
	}
	
	public StatusDto addOtpByUserId(String emailId) {
		
		StatusDto dto = checkIfEmailExists(emailId);
		
		if (dto.getStatus()==StatusType.FAILED) return dto;
		
		User user = userRepository.getUserByEmailId(emailId);
		int userId = user.getUserId();
		
		
		Otp otp = userRepository.addOtpByUserId(userId);
		
		String subject ="OTP for password change";
		String email=user.getEmail();
		String text="Hi "+user.getName()+", use this OTP - "+otp.getOtp()
		+". It will expire after 5 minutes";
		StatusDto emailStatusDto = emailService.sendEmailForNewRegistration(email, text, subject);
//		if (emailStatusDto.getStatus()==StatusType.FAILED)
		System.out.println(emailStatusDto.getMessage());
		System.out.println(text);
		return emailStatusDto;
	}
	
	public StatusDto verifyOtp(String emailId, String otpStr) {
		StatusDto dto = new StatusDto();
		dto.setStatus(StatusType.FAILED);
		User user = userRepository.getUserByEmailId(emailId);
		int userId = user.getUserId();
		
		Otp otp = userRepository.getOtpByUserId(userId);
		
		if (otp==null) {
			dto.setMessage("OTP not generated");
			return dto;
		}
		int minutes = (int) ChronoUnit.MINUTES.between(otp.getTimeOfGeneration(), LocalDateTime.now());
		
		if (minutes>5) {
			dto.setMessage("OTP expired");
			return dto;
		}
		if (otp.getOtp().equalsIgnoreCase(otpStr)) {
			dto.setStatus(StatusType.SUCCESS);
			dto.setMessage("OTP valid");
			return dto;
		}
		dto.setMessage("OTP does not match");
		return dto;
	}

	public Vehicle rcUpload(Vehicle vehicle) {
		return userRepository.save(vehicle);
	}
	public Vehicle findVehicle(int vehicleId) {
		return userRepository.findVehicle(vehicleId);
	}

	@Override
	public StatusDto updateUserPasswordByEmail(String email, String password) {
		StatusDto dto = new StatusDto();
		dto.setStatus(StatusType.FAILED);
		dto.setMessage("Could not update user password");
		
		User user = userRepository.updateUserPasswordByEmailId(email, password);
		if (user!=null) {
			dto.setStatus(StatusType.SUCCESS);
			dto.setMessage("Updated password");
			return dto;
		}
		return dto;
	}
	
	public User findUserById(int userId) {
		return userRepository.findUserById(userId);
	}
}
