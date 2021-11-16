package com.dev.delta.controllers;

import java.io.IOException;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.Invoice;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Role;
import com.dev.delta.entities.Room;
import com.dev.delta.entities.User;
import com.dev.delta.i18n.entities.WebsiteFooterI18n;
import com.dev.delta.i18n.repositories.WebsiteFooterI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;
import com.dev.delta.repositories.InvoiceRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.repositories.RoleRepository;
import com.dev.delta.repositories.RoomRepository;
import com.dev.delta.repositories.UserRepository;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.CustomerService;
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
	
	@Autowired
	UserRepository  userRepository;
	
	@Autowired
	CustomerService  customerService;
	
	@Autowired
	RoleRepository  roleRepository;
	
	@Autowired
	NotificationRepository   notificationRepository;
	
	Notification   notification;

	@Autowired
	InvoiceRepository invoiceRepository;
	
	@Autowired
	RoomRepository  roomRepository;
	
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
	public String addCheckInUser(CheckIn checkIn,@RequestParam("username") String username,
            @RequestParam("password") String password) throws AddressException, MessagingException, IOException {
		System.err.println(username+" "+password);
		Role role=new Role();
		role.setName("CLIENT");
		roleRepository.save(role);
		User user=new User();
		user.setPassword(password);
		user.setUsername(username);
		user.setRole(role);
		userRepository.save(user);
		
		Customer  customer=new Customer();
		
		customer.setAddress(checkIn.getAddress());
		customer.setAge(checkIn.getAge());
		customer.setCity(checkIn.getCity());
		customer.setCountry(checkIn.getCountry());
		customer.setEmail(checkIn.getEmail());
		customer.setFullname(checkIn.getFullname());
		customer.setGender(checkIn.getGender());
		customer.setMobile(checkIn.getMobile());
		customer.setUser(user);
		
		customerService.save(customer);
		
		checkIn.setCutomer(customer);
		CheckIn checkin=checkInService.save(checkIn);
		
		notification=new Notification();
		notification.setDate(new Date().toString());
		notification.setName("New checkin added by "+checkIn.getFullname());
		notificationRepository.save(notification);
		
		Invoice invoice=new Invoice();
		invoice.setCheckIn(checkin);
		invoice.setService(checkin.getRoom().getRoomType().getTitle());
		invoice.setPrice(checkin.getRoom().getRoomType().getBasePrice());
		invoice.setCreateAt(new Date().toString());
		invoiceRepository.save(invoice);
		
		 Room room=checkIn.getRoom();
	     room.setStatus("Inactive"); 
	     roomRepository.save(room);

		return "redirect:/summarybooking/"+checkin.getId();
		
	}
	
	
}
