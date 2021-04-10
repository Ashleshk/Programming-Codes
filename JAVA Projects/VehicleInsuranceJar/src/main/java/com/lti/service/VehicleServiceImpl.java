package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.VehicleManufacturer;
import com.lti.model.VehicleModel;
import com.lti.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public VehicleManufacturer addManufacturer(VehicleManufacturer manufacturer) {
		return vehicleRepository.addManufacturer(manufacturer);
	}

	@Override
	public VehicleModel addModelByManufacturer(VehicleModel model, int manufacturerId) {
		return vehicleRepository.addModelByManufacturer(model, manufacturerId);
	}

	@Override
	public List<VehicleManufacturer> getAllManufacturers() {
		return vehicleRepository.getAllManufacturers();
	}
	
	@Override
	public List<VehicleManufacturer> getAllManufacturersByType(String vehicleType) {
		return vehicleRepository.getAllManufacturersByType(vehicleType);
	}

	@Override
	public List<VehicleModel> getModelsByManufacturer(int manufacturerId) {
		return vehicleRepository.getModelsByManufacturer(manufacturerId);
	}

}
