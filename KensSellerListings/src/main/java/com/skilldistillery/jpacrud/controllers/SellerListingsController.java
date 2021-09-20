package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.jpacrud.dao.SellerListingsDAO;
import com.skilldistillery.jpacrud.entities.SellerListings;

@Controller
public class SellerListingsController {

	@Autowired
	private SellerListingsDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String home(Model model) {
		model.addAttribute("listings", dao.findAll());
		return "home";
	}

	@RequestMapping(path = "getSellerListing.do", method = RequestMethod.GET, params = "id")
	public String show(Model model, @RequestParam Integer id) {
		System.out.println(id);
		SellerListings listing = dao.findById(id);
		System.out.println(listing);
		model.addAttribute("listing", listing);
		return "show";
	}

	@RequestMapping(path = "edit.do", method = RequestMethod.GET)
	public String editSellerListing(Model model, int id) {
		String viewName = "edit";
		SellerListings listing = dao.findById(id);
		model.addAttribute("listing", listing);
		return viewName;
	}
	
	@RequestMapping(path = "updatelisting.do", method= RequestMethod.POST)
	public String updateSellerListing(SellerListings listing, Model model, int id) {
		String viewName ="show";
		SellerListings dbListing = dao.updateListing(id, listing);
		model.addAttribute("listing", dbListing);
		return "show";
		
	}

	@RequestMapping(path = "show.do", method = RequestMethod.POST)
	public String createListing(SellerListings listing, Model model) {
		System.out.println(listing);
		SellerListings create = dao.createListing(listing);
		model.addAttribute("listing", create);
		return "show";

	}

	@RequestMapping(path = "create.do")
	public String listingForm() {
		return "create";
	}

}
