package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpacrud.dao.SellerListingsDAO;

@Controller
public class SellerListingsController {

	
	@Autowired
	private SellerListingsDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String home(Model model) {
	model.addAttribute("listings", dao.findAll());
	return "home";
	}
}
