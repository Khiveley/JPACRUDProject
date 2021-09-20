package com.skilldistillery.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
		String jpql = "SELECT s FROM SellerListings s";
		return em.createQuery(jpql, SellerListings.class).getResultList();
	}
	
	@Override
	public SellerListings createListing(SellerListings listing) {
		System.out.println("----------------------------");
		System.out.println(listing);
		em.persist(listing);
		em.flush();
		
		System.out.println("----------------------------");
		System.out.println(listing);
		return listing;
	}
	
	@Override
	public SellerListings updateListing(int id, SellerListings listing) {
		SellerListings dbListing = em.find(SellerListings.class, id);
		
		dbListing.setName(listing.getName());
		dbListing.setType(listing.getType());
		dbListing.setCondition(listing.getCondition());
		dbListing.setConditionDescription(listing.getConditionDescription());
		dbListing.setCardNumber(listing.getCardNumber());
		dbListing.setSeries(listing.getSeries());
		dbListing.setImageUrl(listing.getImageUrl());
		dbListing.setRarity(listing.getRarity());
		
		return dbListing;
		
	}
	
	
	@Override
	public boolean deleteListing(int id) {
		boolean result = false;
		SellerListings listing = em.find(SellerListings.class, id);
		em.remove(listing);
		
		listing = em.find(SellerListings.class, id);
		result = !em.contains(listing);
		return result;
		
	}

	@Override
	public String findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

//	@Override
//	public String findByName(String name) {
//		
//		String query = "SELECT sellerlistings.id FROM SELLERLISTINGS WHERE sellerlisitngs.name = :name";
//		String name = (String) em.createQuery(query).setParameter("name", name).getSingleResult();
//		
//		return name;
//		
//	}
	

}
