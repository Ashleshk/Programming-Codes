package com.lti.dto;

public class CalculateDetailsDto {
	String planType;
	String vehicleType;
	double vehicleValue;
	int ageInYears;
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getVehicleValue() {
		return vehicleValue;
	}
	public void setVehicleValue(double vehicleValue) {
		this.vehicleValue = vehicleValue;
	}
	public int getAgeInYears() {
		return ageInYears;
	}
	public void setAgeInYears(int ageInYears) {
		this.ageInYears = ageInYears;
	}
	
	
}
