package com.lti.repository;

import java.util.List;

import com.lti.model.Admin;
import com.lti.model.Claim;
import com.lti.model.Parameter;

public interface AdminRepository {

	public Admin isValidAdmin(String adminEmail,String password);
	
	public Admin insertAdminCredentials(Admin admin);
	
	
	public List<Claim> getAllClaims();
	public Claim setClaimAmmount(Claim c);
	public Claim getClaim(int claimId);
	
	public Parameter setParameter(String key, double value);
	
	public Parameter getParameter(String key);
	
	public List<Parameter> getAllParameters();
}
