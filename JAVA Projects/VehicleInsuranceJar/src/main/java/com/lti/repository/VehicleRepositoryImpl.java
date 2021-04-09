package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.VehicleManufacturer;
import com.lti.model.VehicleModel;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public VehicleManufacturer addManufacturer(VehicleManufacturer manufacturer) {
		return em.merge(manufacturer);
	}

	@Transactional
	public VehicleModel addModelByManufacturer(VehicleModel model, int manufacturerId) {
		VehicleManufacturer manufacturer = em.find(VehicleManufacturer.class, manufacturerId);
		if (manufacturer==null) return null;
		
		model.setVehicleManufacturer(manufacturer);
		return em.merge(model);
	}

	@Override
	public List<VehicleManufacturer> getAllManufacturers() {
		String jpql="select m from VehicleManufacturer m";
		TypedQuery<VehicleManufacturer> query=em.createQuery(jpql,VehicleManufacturer.class); //type safe code
		return query.getResultList();
	}
	
	public List<VehicleManufacturer> getAllManufacturersByType(String vehicleType) {
		String jpql="select m from VehicleManufacturer m where m.type=:vtype";
		TypedQuery<VehicleManufacturer> query=em.createQuery(jpql,VehicleManufacturer.class); //type safe code
		query.setParameter("vtype", vehicleType);
		return query.getResultList();
	}
	
	
	@Override
	public List<VehicleModel> getModelsByManufacturer(int manufacturerId) {
		VehicleManufacturer manufacturer = em.find(VehicleManufacturer.class, manufacturerId);
		if (manufacturer == null) return null;
		return manufacturer.getVehicleModels();
	}

	public VehicleModel getModel(int modelId) {
		return em.find(VehicleModel.class, modelId);
	}
	
	public VehicleModel getVehicleModelByName(String vehicleName) {
		String jpql="select m from VehicleModel m where m.name=:vname";
		TypedQuery<VehicleModel> query=em.createQuery(jpql,VehicleModel.class); //type safe code
		query.setParameter("vname", vehicleName);
		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
