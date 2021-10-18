package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.services.InformationService;

@Controller
public class InformationController {

	@Autowired
	InformationService informationService;
	
	
	@GetMapping("/informationsadmin")
	public String getInformations(Model model) {
		List<InformationHotel> infos = informationService.getInformations();
		model.addAttribute("items", infos);
		
		return "information/informations";
	}
}
