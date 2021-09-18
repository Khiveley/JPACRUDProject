package com.skilldistillery.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.SellerListings;

@Service
@Transactional
public class SellerListingsImpl implements SellerListingsDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public SellerListings findById(int SellerListingId) {
		return em.find(SellerListings.class, SellerListingId);
	}

	@Override
	public List<SellerListings> findAll() {
		String jpql = "SELECt s FROM SellerListings s";
		return em.createQuery(jpql, SellerListings.class).getResultList();
	}
	

}
