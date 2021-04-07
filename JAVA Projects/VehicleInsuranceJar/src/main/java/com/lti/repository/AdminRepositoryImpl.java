package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Admin;
import com.lti.model.Claim;
import com.lti.model.Parameter;
import com.lti.model.VehicleManufacturer;

@Repository
public class AdminRepositoryImpl implements AdminRepository {

	@PersistenceContext
	EntityManager em;

	public Admin isValidAdmin(String adminEmail, String password) {
		String jpql = "select a from Admin a where a.email=:aname and a.password=:apass";
		Query query = em.createQuery(jpql);
		query.setParameter("aname", adminEmail);
		query.setParameter("apass", password);
		try {
			return (Admin) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@Transactional
	public Admin insertAdminCredentials(Admin admin) {
		return em.merge(admin);
	}

	public List<Claim> getAllClaims() {
		String jpql = "select c from Claim c";
		Query query = em.createQuery(jpql);
		List<Claim> claims = query.getResultList();

		return claims;
	}

	@Transactional
	public Claim setClaimAmmount(Claim c) {
		Claim claim = em.merge(c);
		return claim;
	}


	
	public Claim getClaim(int claimId) {
		return em.find(Claim.class, claimId);
		
}
	@Transactional
	public Parameter setParameter(String key, double value) {
		String jpql = "SELECT p.parameterId from Parameter p WHERE p.key=:pkey";
		Query query = em.createQuery(jpql);
		query.setParameter("pkey", key);
		try {
			int id = (int) query.getSingleResult();
			
			Parameter parameter = em.find(Parameter.class, id);
			
			parameter.setValue(value);
			
			return em.merge(parameter); 
		} catch (NoResultException e) {
			Parameter parameter = new Parameter();
			parameter.setKey(key);
			parameter.setValue(value);
			
			return em.merge(parameter); 
		}
		
		
//		String jpql = "UPDATE p from Parameters p SET p.value=:pval where p.key=:pkey";
//		Query query = em.createQuery(jpql);
//		query.setParameter("pkey", key);
//		query.setParameter("pval", value);
//		int rowsUpdated = query.executeUpdate();
//		System.out.println("entities Updated: " + rowsUpdated);
//		em.getTransaction().commit();
//		em.close();
//		return rowsUpdated;

	}
	
	
	public Parameter getParameter(String key) {
		String jpql = "SELECT p.parameterId from Parameter p WHERE p.key=:pkey";
		Query query = em.createQuery(jpql);
		query.setParameter("pkey", key);
		try {
			int id = (int) query.getSingleResult();
			
			return em.find(Parameter.class, id);
			
		} catch (NoResultException e) {
			return null;
		}
		
		
//		String jpql = "UPDATE p from Parameters p SET p.value=:pval where p.key=:pkey";
//		Query query = em.createQuery(jpql);
//		query.setParameter("pkey", key);
//		query.setParameter("pval", value);
//		int rowsUpdated = query.executeUpdate();
//		System.out.println("entities Updated: " + rowsUpdated);
//		em.getTransaction().commit();
//		em.close();
//		return rowsUpdated;
	}

	@Override
	public List<Parameter> getAllParameters() {
		String jpql="select m from Parameter m";
		TypedQuery<Parameter> query=em.createQuery(jpql,Parameter.class); //type safe code
		return query.getResultList();
	}

}
