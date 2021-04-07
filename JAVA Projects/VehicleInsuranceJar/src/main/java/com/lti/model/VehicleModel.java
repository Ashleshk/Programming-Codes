package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbl_vehicle_model")
public class VehicleModel {
	@Id
	@SequenceGenerator(name="seq_vehicle_model",initialValue=38000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_vehicle_model")
	int vehicleModelId;
	
	String name;
	
	double value;
	
	@ManyToOne
	@JoinColumn(name="manufacturerId")
	@JsonIgnore
	VehicleManufacturer vehicleManufacturer;

	public int getVehicleModelId() {
		return vehicleModelId;
	}

	public void setVehicleModelId(int vehicleModelId) {
		this.vehicleModelId = vehicleModelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public VehicleManufacturer getVehicleManufacturer() {
		return vehicleManufacturer;
	}

	public void setVehicleManufacturer(VehicleManufacturer vehicleManufacturer) {
		this.vehicleManufacturer = vehicleManufacturer;
	}
	
	
}
