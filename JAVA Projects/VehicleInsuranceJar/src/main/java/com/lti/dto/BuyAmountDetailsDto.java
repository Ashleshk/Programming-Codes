package com.lti.dto;

public class BuyAmountDetailsDto {
	String planType;
	String vehicleType;
	int selectedVehicleModelId;
	String purchaseDate;
	int yearsOfInsuranceSelected;
	
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
	
	public int getSelectedVehicleModelId() {
		return selectedVehicleModelId;
	}
	public void setSelectedVehicleModelId(int selectedVehicleModelId) {
		this.selectedVehicleModelId = selectedVehicleModelId;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getYearsOfInsuranceSelected() {
		return yearsOfInsuranceSelected;
	}
	public void setYearsOfInsuranceSelected(int yearsOfInsuranceSelected) {
		this.yearsOfInsuranceSelected = yearsOfInsuranceSelected;
	}
	
	
}
