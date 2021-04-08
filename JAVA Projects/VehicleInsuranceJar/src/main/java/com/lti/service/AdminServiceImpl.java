package com.lti.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dto.ContactDto;
import com.lti.dto.StatusDto;
import com.lti.dto.StatusDto.StatusType;
import com.lti.model.Admin;
import com.lti.model.Claim;
import com.lti.model.Parameter;
import com.lti.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	EmailService emailService;
	
	public Admin isValidAdmin(String adminEmail, String password) {
		return adminRepository.isValidAdmin(adminEmail, password);
	}
	
	public Admin insertAdminCredentials(Admin admin) {
		return adminRepository.insertAdminCredentials(admin);
	}

	public List<Claim> getAllClaims() {
		return adminRepository.getAllClaims();
	}

	@Override
	public Claim setClaimAmmount(Claim c) {
		
		Claim claim = adminRepository.setClaimAmmount(c);
		
		if (claim!=null) {
			if (!claim.getResponse().equalsIgnoreCase("unchecked")) {
				String subject ="Claim updated - SVAM Services";
				String email=claim.getPolicy().getUser().getEmail();
//				String text="Hi "+claim.getPolicy().getUser().getName()+", your claim with ID - "+claim.getClaimId()+" has been "+claim.getResponse();
				
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("Name", claim.getPolicy().getUser().getName());
				m.put("claimId", claim.getClaimId());
				m.put("amount", claim.getAmount());
				m.put("claimDate", claim.getClaimDate().toString());
				m.put("policyId", claim.getPolicy().getPolicyId());
				m.put("planType", claim.getPolicy().getPlan().getPlanType());
				m.put("claimStatus", claim.getResponse());
				StatusDto emailStatusDto = emailService.sendEmail(email,subject, m, "admin-response.ftl");
				System.out.println(emailStatusDto.getStatus());
			}
			System.out.println(claim.getPolicy().getUser().getEmail());
		}
		
		return claim;
	}

	@Override
	public Claim getClaimById(int claimId) {
		return adminRepository.getClaim(claimId);
	}
	
	public Parameter setParameter(String key, double value) {
		return adminRepository.setParameter(key, value);
	}
	
	
	public Parameter getParameter(String key) {
		return adminRepository.getParameter(key);
	}

	@Override
	public List<Parameter> getAllParameter() {
		return adminRepository.getAllParameters();
	}

	public StatusDto sendMailToUser(ContactDto contactDto ) {
		
		String subject ="Query Received By SAVM  services";
		String email=contactDto.getEmail();
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("Name", contactDto.getName());
		m.put("Message",contactDto.getMessage() );
		StatusDto emailStatusDto = emailService.sendEmail(email, subject, m, "contact.ftl");
		System.out.println("email sent to user");
		if (emailStatusDto.getStatus()==StatusType.FAILED) {
			System.out.println(emailStatusDto.getMessage());
			System.out.println("email not sent");
		}
        return emailStatusDto;
	}
	public StatusDto sendMailToAdmin(ContactDto contactDto ) {
		StatusDto status = new StatusDto();
		
		String subject ="";
		String text="Hi Admin , "+contactDto.getName()+"("+contactDto.getEmail()+")"+" sent "+contactDto.getMessage();
		try {
			emailService.sendEmailForNewRegistration("lti.generalinsurance.group5@outlook.com", text, subject);
		} catch (Exception e) {
			status.setStatus(StatusType.FAILED);
			status.setMessage("File upload failed!");
			System.out.println("failed");
		}
		System.out.println("email sent");
		status.setStatus(StatusType.SUCCESS);
		status.setMessage("email sent");
        return status;
	}
}
