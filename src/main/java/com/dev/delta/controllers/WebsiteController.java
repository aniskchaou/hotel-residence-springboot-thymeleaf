package com.dev.delta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.repositories.InformationRepository;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.RoomTypeService;

@Controller
public class WebsiteController {

	@Autowired
	InformationRepository informationService;

	@Autowired
	private CheckInService checkInService;

	@Autowired
	private CityService cityService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private GuestTypeService guestTypeService;

	@Autowired
	private RoomTypeService roomTypeService;

	@GetMapping("/dashboard")
	public String homeAdmin() {

		return "/home/index";
	}

	@GetMapping("/")
	public String home(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		return "/website/index";
	}

	@GetMapping("/about")
	public String about(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		return "/website/about";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		return "/website/contact";
	}

	@GetMapping("/blog")
	public String blog() {

		return "/website/blog";
	}
}
