package com.dev.delta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.repositories.InformationRepository;

@Controller
public class WebsiteController {

	@Autowired
	InformationRepository informationService;
	
	@GetMapping("/dashboard")
	public String homeAdmin() {
   
		return "/home/index";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		Long id=1L;
         InformationHotel informationHotel=informationService.findById(id).get();
         model.addAttribute("hotel", informationHotel);
		return "/website/index";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		Long id=1L;
        InformationHotel informationHotel=informationService.findById(id).get();
        model.addAttribute("hotel", informationHotel);
		return "/website/about";
	}
	
	
	@GetMapping("/contact")
	public String contact(Model model) {
		Long id=1L;
        InformationHotel informationHotel=informationService.findById(id).get();
        model.addAttribute("hotel", informationHotel);
		return "/website/contact";
	}
	
	
	@GetMapping("/blog")
	public String blog() {
   
		return "/website/blog";
	}
}
