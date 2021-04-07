package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Claim;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;

@Repository
public class PolicyRepositoryImpl implements PolicyRepository {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Claim addClaimToPolicy(Claim claim, int policyId) {
		Policy policy = getPolicyById(policyId);
		if (policy==null) return null;
		List<Claim> policyClaims = policy.getClaims();
		policyClaims.add(claim);
		policy.setClaims(policyClaims);
		claim.setPolicy(policy);
		return em.merge(claim);
	}

	public List<Policy> getUserPolicyInfo(int userId) {
		User user = em.find(User.class, userId);
		if (user!=null) return user.getPolicies();
		return null;
	}

	public List<Claim> getClaimsByPolicy(int policyId) {
		Policy policy = getPolicyById(policyId);
		if (policy==null) return null;
		return policy.getClaims();
	}
	
	public Policy getPolicyById(int policyId) {
		return em.find(Policy.class, policyId);
	}

	public Vehicle getVehicleByPolicy(int policyId) {
		return em.find(Policy.class, policyId).getVehicle();
	}

	public Plan getPlanByPolicy(int policyId) {
		return em.find(Policy.class, policyId).getPlan();
	}

}
