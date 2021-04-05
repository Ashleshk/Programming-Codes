package com.lti.dto;


import org.springframework.web.multipart.MultipartFile;

public class DocumentsUploaded {

	private String userId;
	private MultipartFile vehicleRC;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public MultipartFile getVehicleRC() {
		return vehicleRC;
	}
	public void setVehicleRC(MultipartFile vehicleRC) {
		this.vehicleRC = vehicleRC;
	}
	
	
}
