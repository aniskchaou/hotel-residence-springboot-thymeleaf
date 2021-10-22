package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.Blog;
import com.dev.delta.entities.Offer;
import com.dev.delta.services.OfferService;

@Controller
public class OfferController {

	@Autowired
	private OfferService offerService;
	
	
	@GetMapping("/offersadmin")
	public String getOffersAdmin(Model model) {
		List<Offer> offers = offerService.getOffers();
		model.addAttribute("items", offers);

		return "offer/offers";
	}
	
	
}
