package com.dev.delta.controllers;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.Room;
import com.dev.delta.i18n.repositories.WebsiteFooterI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.RoomService;
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
	
	@Autowired
	WebsiteMenuI18nRepository  websiteMenuI18nRepository;
	
	@Autowired
	WebsiteFooterI18nRepository  websiteFooterI18nRepository;
	
	@Autowired
	RoomService roomService ;
	
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
		String lang=informationHotel.getLang();
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		return "website/showroom";
	}
	
	@GetMapping("/detailbooking/{id}")
	public String getDetailBooking(@PathVariable("id") Long id,Model model) {
		model.addAttribute("roomid", id);
		Room room=roomService.findById(id).get();
		model.addAttribute("roomtype", room.getRoomType().getId());
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		String lang=informationHotel.getLang();
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		return "website/validationbooking";
	}
	
	
	@GetMapping("/summarybooking/{id}")
	public String getSummaryBooking(@PathVariable("id") Long id,Model model) {
		model.addAttribute("roomid", id);
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		model.addAttribute("hotel", informationHotel);
		String lang=informationHotel.getLang();
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		return "website/detailbooking";
	}
	
	@GetMapping("/paymentbooking/{id}")
	public String getPaymentBooking(@PathVariable("id") Long id,Model model) {
		model.addAttribute("roomid", id);
		Long idd = 1L;
		InformationHotel informationHotel = informationService.findById(idd);
		String lang=informationHotel.getLang();
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		model.addAttribute("hotel", informationHotel);
		return "website/paymentbooking";
	}
	
	
	@PostMapping("/addcheckinregistration")
	public String addCheckInUser(CheckIn checkIn) throws AddressException, MessagingException, IOException {
		
		CheckIn checkin=checkInService.save(checkIn);
		//sendEmail(checkIn);
		return "redirect:/summarybooking/"+checkin.getId();
	}
	
	
}
