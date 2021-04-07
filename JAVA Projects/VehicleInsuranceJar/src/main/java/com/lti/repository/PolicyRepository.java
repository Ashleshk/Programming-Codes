package com.lti.repository;

import java.util.List;

import com.lti.model.Claim;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.Vehicle;

public interface PolicyRepository {
	
	public Claim addClaimToPolicy(Claim claim, int policyId);
	
	public List<Policy> getUserPolicyInfo(int userId);  //user getting the policy and vehicle details after login
	
	public List<Claim> getClaimsByPolicy(int policyId);
	public Vehicle getVehicleByPolicy(int policyId);
	public Plan getPlanByPolicy(int policyId);
	
	public Policy getPolicyById (int policyId);
}
