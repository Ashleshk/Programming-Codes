package com.lti.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dto.StatusDto;
import com.lti.dto.StatusDto.StatusType;
import com.lti.model.Claim;
import com.lti.model.Plan;
import com.lti.model.Parameter;
import com.lti.model.Policy;
import com.lti.model.Vehicle;

import com.lti.model.VehicleModel;
import com.lti.repository.AdminRepository;
import com.lti.repository.PolicyRepository;
import com.lti.repository.VehicleRepository;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyRepository policyRepository;

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	VehicleRepository vehicleRepository;

	public StatusDto addClaimToPolicy(Claim claim, int policyId) {
		StatusDto dto = new StatusDto();
		dto.setStatus(StatusType.FAILED);
		Policy policy = policyRepository.getPolicyById(policyId);
		if (policy == null) {
			dto.setMessage("policy with id "+policyId+" does not exist");
			return dto;
		}
		if (policy.getExpiryDate().isBefore(LocalDate.now())) {
			dto.setMessage("policy with id "+policyId+" has expired");
			dto.setStatus(StatusType.POLICYEXPIRED);
			return dto;
		}
		claim = policyRepository.addClaimToPolicy(claim, policyId);
		dto.setStatus(StatusType.SUCCESS);
		dto.setMessage("claim with id "+claim.getClaimId()+" added to policy with id "+policyId);
		return dto;
	}

	public List<Policy> getUserPolicyInfo(int userId) {

		return policyRepository.getUserPolicyInfo(userId);
	}

	public List<Claim> getClaimsByPolicy(int policyId) {
		return policyRepository.getClaimsByPolicy(policyId);
	}

	public Vehicle getVehicleByPolicyId(int policyId) {
				
		return policyRepository.getVehicleByPolicy(policyId);
	}

	public Plan getPlanByPolicy(int policyId) {
		return policyRepository.getPlanByPolicy(policyId);
	}


	public double getPremiumEstimate(String planType, String vehicleType, double vehicleValue, int ageInYears) {

		double comprehensiveAmount = 0.0;
		if (planType.equalsIgnoreCase("Comprehensive")) {
			double premiumRate = (vehicleType.equalsIgnoreCase("car") ? 3.3 : 1.7);
			String premiumKey = (vehicleType.equalsIgnoreCase("car") ? "premium-rate-car" : "premium-rate-bike");
			Parameter parameter = adminRepository.getParameter(premiumKey);
			if (parameter != null)
				premiumRate = parameter.getValue();
			double depreciatedValue = (1 - ((double)ageInYears / 10)) * vehicleValue;
			
			String depreciationKey = "depreciation-year-" + ageInYears;
			parameter = adminRepository.getParameter(depreciationKey);
			if (parameter != null) {
				depreciatedValue = parameter.getValue() * vehicleValue;
			}
			if (depreciatedValue < (0.5 * vehicleValue) || depreciatedValue > vehicleValue)
				depreciatedValue = 0.5 * vehicleValue;
			
			comprehensiveAmount = depreciatedValue * (premiumRate/100);
		}
		
		double estimate = (vehicleType.equalsIgnoreCase("car") ? 3000 : 1500);
		String thirdPartyPremiumKey = "third-party-premium-" + vehicleType;
		Parameter parameter = adminRepository.getParameter(thirdPartyPremiumKey);
		if (parameter != null) {
			estimate = parameter.getValue();
		}
		return (double) Math.round((estimate+comprehensiveAmount)*100)/100;
	}
	
	public double getBuyAmount(String planType, String vehicleType, int selectedVehicleModelId, String purchaseDate, int yearsOfInsurance) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		int ageInYears = (int) ChronoUnit.YEARS.between(LocalDate.parse(purchaseDate,formatter), LocalDate.now());
		VehicleModel model = vehicleRepository.getModel(selectedVehicleModelId);
		if (model==null) return 0;
		double vehicleValue = model.getValue();
		
		double discountPercentage = (vehicleType.equalsIgnoreCase("car") ? 20 : 15);
		String thirdPartyPremiumKey = "buy-discount-" + vehicleType;
		Parameter parameter = adminRepository.getParameter(thirdPartyPremiumKey);
		if (parameter != null) {
			discountPercentage = parameter.getValue();
		}
		
		double amount = getPremiumEstimate(planType,vehicleType,vehicleValue,ageInYears)*((100-discountPercentage)/100)*yearsOfInsurance*(100-(2.5*yearsOfInsurance))/100;
		
		
		return (double) Math.round(amount*100)/100;
		
	}


	public double getRenewAmount(int policyId, String planType) {
		Policy policy = policyRepository.getPolicyById(policyId);
		
		String vehicleType = policy.getVehicle().getVehicleType();
		
		VehicleModel model = vehicleRepository.getVehicleModelByName(policy.getVehicle().getVehicleModel());
		if (model == null) return 0;
		
		double vehicleValue = model.getValue();
		
		double discountPercentage = (vehicleType.equalsIgnoreCase("car") ? 20 : 30);
		String thirdPartyPremiumKey = "renew-discount-" + vehicleType;
		Parameter parameter = adminRepository.getParameter(thirdPartyPremiumKey);
		if (parameter != null) {
			discountPercentage = parameter.getValue();
		}
		
		int ageInYears = (int) ChronoUnit.YEARS.between(policy.getVehicle().getPurchaseDate(), LocalDate.now());
		
		double amount =  getPremiumEstimate(planType,vehicleType,vehicleValue,ageInYears)*((100-discountPercentage)/100);
		
		return (double) Math.round(amount*100)/100;
	}
}
