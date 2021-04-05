package com.lti.dto;

import org.springframework.web.multipart.MultipartFile;

public class ClaimsDto {
	String date;
	int claimId;
	double amount;
	String reason;
	int policyId;
	String response;
	MultipartFile license;
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public MultipartFile getLicense() {
		return license;
	}
	public void setLicense(MultipartFile license) {
		this.license = license;
	}
	
	
}
