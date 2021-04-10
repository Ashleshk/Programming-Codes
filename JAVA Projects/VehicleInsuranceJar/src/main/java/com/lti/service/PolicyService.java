package com.lti.service;

import java.util.List;

import com.lti.dto.StatusDto;
import com.lti.model.Claim;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.Vehicle;

public interface PolicyService {

	public StatusDto addClaimToPolicy(Claim claim, int policyId);
	
	public List<Policy> getUserPolicyInfo(int userId);  //user getting the policy and vehicle details after login
	
	public List<Claim> getClaimsByPolicy(int policyId);
	
	public Vehicle getVehicleByPolicyId(int policyId);
	
	public Plan getPlanByPolicy(int policyId);
	public double getPremiumEstimate(String planType, String vehicleType, double vehicleValue, int age);
	
	public double getBuyAmount(String planType, String vehicleType, int selectedVehicleModelId, String purchaseDate, int yearsOfInsurance);
	
	public double getRenewAmount(int policyId, String planType);
}
