
package com.lti.repository;


import com.lti.model.Otp;
import com.lti.model.Plan;
import com.lti.model.Policy;

import com.lti.model.User;
import com.lti.model.Vehicle;

public interface UserRepository {
	public User addorUpdateUser(User user);
	
	public Policy addPolicyToUser(Plan plan, Vehicle vehicle, int userId);


	
	public Vehicle findVehicle(int vehicleId);
	
	public Vehicle save(Vehicle vehicle);

	public User validateUserlogin(String emailId, String password);
	
	//renew policy
	public Policy findPolicyById(int policyId);
	
//	public Plan renewPolicyByUser(int userId,int policyId,Plan plan); 
	
	public Policy renewPolicy(int policyId, String planType);
	
	public User getUserByEmailId(String emailId);
	public Otp getOtpByUserId(int userId);
	public Otp addOtpByUserId(int userId);
	
	public User updateUserPasswordByEmailId(String emailId, String password);
	public User findUserById(int userId);

}