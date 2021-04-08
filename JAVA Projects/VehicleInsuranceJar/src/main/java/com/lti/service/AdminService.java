package com.lti.service;

import java.util.List;

import com.lti.dto.ContactDto;
import com.lti.dto.StatusDto;
import com.lti.model.Admin;
import com.lti.model.Claim;
import com.lti.model.Parameter;

public interface AdminService {
	public Admin isValidAdmin(String adminEmail,String password);
	public Admin insertAdminCredentials(Admin admin);
	
	public List<Claim> getAllClaims();
	public Claim setClaimAmmount(Claim c);
	public Claim getClaimById(int claimId);
	
	public Parameter setParameter(String key, double val);
	
	public Parameter getParameter(String key);
	
	public List<Parameter> getAllParameter();
	
	public StatusDto sendMailToUser(ContactDto contactDto);
	
	StatusDto sendMailToAdmin(ContactDto contactDto );
}
