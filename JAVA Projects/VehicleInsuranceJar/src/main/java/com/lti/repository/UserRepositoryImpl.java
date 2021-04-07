package com.lti.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Otp;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public User addorUpdateUser(User user) {
		return em.merge(user);
	}

	@Transactional
	public Policy addPolicyToUser(Plan plan, Vehicle vehicle, int userId) {
		User user = findUserById(userId);
		if (user==null) return null;
		plan = em.merge(plan);
		
		vehicle = em.merge(vehicle);
		
		Policy policy = new Policy();
		
		policy.setExpiryDate(LocalDate.now().plusYears(plan.getYear()));
		policy.setPlan(plan);
		
		policy.setVehicle(vehicle);
		
		policy.setUser(user);
		
		return em.merge(policy);
	}
	
	public User findUserById(int userId) {
		return em.find(User.class, userId);
	}

	
	public User validateUserlogin(String emailId, String password) {
		String jpql="select u from User u where u.email=:uname and u.password=:upass";
		Query query=em.createQuery(jpql);
		query.setParameter("uname", emailId);
		query.setParameter("upass", password);
		try {
			return (User) query.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			return null;
		}

	}
	
	public User getUserByEmailId(String emailId) {
		String jpql="select u from User u where u.email=:uname";
		Query query=em.createQuery(jpql);
		query.setParameter("uname", emailId);
		try {
			return (User) query.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			return null;
		}

	}
	
	
	//Renew policy
	
	public Policy findPolicyById(int policyId) {
		return em.find(Policy.class, policyId);
	}
	
//	@Transactional
//	public Plan renewPolicyByUser(int userId,int policyId,Plan plan) {
//		User user = findUserById(userId);
//		Policy policy=findPolicyById(policyId);
//		if (user==null || policy==null) return null;
//		return em.merge(plan);
//	}
	
	@Transactional
	public Policy renewPolicy(int policyId, String planType) {
		Policy policy=findPolicyById(policyId);
		if (policy==null) return null;
		
		Plan plan = policy.getPlan();
		plan.setPlanType(planType);
		policy.setPlan(plan);
		policy.setExpiryDate(LocalDate.now().plusYears(1));
		
		return em.merge(policy);
	}
	
	public Otp getOtpByUserId(int userId) {
		String jpql="select o from Otp o where o.userId=:uid";
		Query query=em.createQuery(jpql);
		query.setParameter("uid", userId);
		try {
			return (Otp) query.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
	@Transactional
	public Otp addOtpByUserId(int userId) {
		Random r = new Random();
	    String randomNumber = String.format("%04d", (Object) Integer.valueOf(r.nextInt(1001)));
		
		Otp otp = getOtpByUserId(userId);
		if (otp==null) {
			otp = new Otp();
			otp.setUserId(userId);
		}
		otp.setTimeOfGeneration(LocalDateTime.now());
		otp.setOtp(randomNumber);
		return em.merge(otp);
	}

	public Vehicle findVehicle(int vehicleId) {
		return em.find(Vehicle.class, vehicleId);
	}

	@Transactional
	public Vehicle save(Vehicle vehicle) {
		Vehicle newVehicle=em.merge(vehicle);
		return newVehicle;
	}

	@Transactional
	public User updateUserPasswordByEmailId(String emailId, String password) {
		User user = getUserByEmailId(emailId);
		if (user== null ) return null;
		user.setPassword(password);
		return em.merge(user);
	}
	
	
}
