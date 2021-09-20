package com.skilldistillery.jpacrud.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.skilldistillery.jpacrud.entities.SellerListings;

public interface SellerListingsDAO {

	SellerListings findById(int SellerListingId);
	List<SellerListings> findAll();
	SellerListings updateListing(int id, SellerListings listing);
	boolean deleteListing(int id);
	String findByName(String name);
	SellerListings createListing(SellerListings listing);
}
