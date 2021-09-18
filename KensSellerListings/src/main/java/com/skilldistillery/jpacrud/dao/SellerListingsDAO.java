package com.skilldistillery.jpacrud.dao;

import java.util.List;

import com.skilldistillery.jpacrud.entities.SellerListings;

public interface SellerListingsDAO {

	SellerListings findById(int SellerListingId);
	List<SellerListings> findAll();
}
