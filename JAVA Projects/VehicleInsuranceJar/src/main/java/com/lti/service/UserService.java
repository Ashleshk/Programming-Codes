package com.lti.service;


import com.lti.dto.StatusDto;
import com.lti.model.Plan;

import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;

public interface UserService {

public User addorUpdateUser(User user);
	
	public Policy addPolicyToUser(Plan plan, Vehicle vehicle, int userId);
	
	public User validateUserLogin(String emailId, String password);
	
    public Policy findPolicyById(int policyId);
	
//	public Plan renewPolicyByUser(int userId,int policyId,Plan plan); 
    
    public StatusDto renewPolicy(int policyId, String planType);
    
    public StatusDto addOtpByUserId(String emailId);
    
    public StatusDto verifyOtp(String emailId, String otpStr);
	
    public Vehicle rcUpload(Vehicle vehicle);
 
    public Vehicle findVehicle(int vehicleId);
    
    public StatusDto updateUserPasswordByEmail(String email, String password);
    
    public User findUserById(int userId);
}