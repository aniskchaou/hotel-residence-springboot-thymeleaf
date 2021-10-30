package com.dev.delta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.RoomTypeService;

@Controller
public class BookingController {

	@Autowired
	InformationService informationService;
	
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
	
	/*@GetMapping("/validationbooking/{id}")
	public String getBlogs(@PathVariable("id") Long id,Model model) {
		//List<Blog> blogs = blogService.getBlogs();
		//model.addAttribute("items", blogs);
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		model.addAttribute("hotel", informationHotel);
		return "website/validationbooking";
	}*/
	
	@GetMapping("/bookingroom/{id}")
	public String getBookingRoom(@PathVariable("id") Long id,Model model) {
		model.addAttribute("roomid", id);
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		model.addAttribute("hotel", informationHotel);
		return "website/showroom";
	}
	
	@GetMapping("/detailbooking/{id}")
	public String getDetailBooking(@PathVariable("id") Long id,Model model) {
		model.addAttribute("roomid", id);
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		return "website/validationbooking";
	}
	
	
	@GetMapping("/summarybooking/{id}")
	public String getSummaryBooking(@PathVariable("id") Long id,Model model) {
		model.addAttribute("roomid", id);
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		model.addAttribute("hotel", informationHotel);
		return "website/detailbooking";
	}
	
	@GetMapping("/paymentbooking/{id}")
	public String getPaymentBooking(@PathVariable("id") Long id,Model model) {
		model.addAttribute("roomid", id);
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		model.addAttribute("hotel", informationHotel);
		return "website/paymentbooking";
	}
	
	
}
