package com.lti.service;

import java.util.List;

import com.lti.model.VehicleManufacturer;
import com.lti.model.VehicleModel;

public interface VehicleService {
	public VehicleManufacturer addManufacturer(VehicleManufacturer manufacturer);
	
	public VehicleModel addModelByManufacturer(VehicleModel model, int manufacturerId);
	
	public List<VehicleManufacturer> getAllManufacturers();
	
	public List<VehicleManufacturer> getAllManufacturersByType(String vehicleType);
	
	public List<VehicleModel> getModelsByManufacturer(int manufacturerId);
}
