package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_vehicle_manufacturer")
public class VehicleManufacturer {
	@Id
	@SequenceGenerator(name="seq_vehicle_manufacturer",initialValue=32000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_vehicle_manufacturer")
	int vehicleManufacturerId;
	
	String name;
	
	String type;
	
	@OneToMany(mappedBy="vehicleManufacturer",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	List<VehicleModel> vehicleModels;

	public int getVehicleManufacturerId() {
		return vehicleManufacturerId;
	}

	public void setVehicleManufacturerId(int vehicleManufacturerId) {
		this.vehicleManufacturerId = vehicleManufacturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<VehicleModel> getVehicleModels() {
		return vehicleModels;
	}

	public void setVehicleModels(List<VehicleModel> vehicleModels) {
		this.vehicleModels = vehicleModels;
	}
	
	
}
