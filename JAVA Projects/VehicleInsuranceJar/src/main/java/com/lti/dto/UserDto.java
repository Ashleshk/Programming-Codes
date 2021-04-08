package com.lti.dto;

import org.springframework.web.multipart.MultipartFile;

public class UserDto {
	String name;
	String email;
	String dateOfBirth;
	String mobileNumber;
	String address;
	String password;
	MultipartFile aadhaar;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MultipartFile getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(MultipartFile aadhaar) {
		this.aadhaar = aadhaar;
	}
	
	
}
