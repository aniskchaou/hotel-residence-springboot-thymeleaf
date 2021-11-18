package com.dev.delta.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.email.EmailService;
import com.dev.delta.email.EmailSetting;
import com.dev.delta.email.EmailSettingRepository;
import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.Food;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.Invoice;
import com.dev.delta.entities.LaundryItem;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Role;
import com.dev.delta.entities.Room;
import com.dev.delta.entities.Service;
import com.dev.delta.entities.User;
import com.dev.delta.entities.VAT;
import com.dev.delta.i18n.entities.CheckInI18n;
import com.dev.delta.i18n.entities.ExtraBedI18n;
import com.dev.delta.i18n.entities.FoodOrderI18n;
import com.dev.delta.i18n.entities.HouseKeepingOrderI18n;
import com.dev.delta.i18n.entities.LaundryOrderI18n;
import com.dev.delta.i18n.repositories.CheckInI18nRepository;
import com.dev.delta.i18n.repositories.ExtraBedI18nRepository;
import com.dev.delta.i18n.repositories.FoodOrderI18nRepository;
import com.dev.delta.i18n.repositories.HouseKeepingOrderI18nRepository;
import com.dev.delta.i18n.repositories.LaundryItemI18nRepository;
import com.dev.delta.i18n.repositories.LaundryOrderI18nRepository;
import com.dev.delta.repositories.CustomerRepository;
import com.dev.delta.repositories.InvoiceRepository;
import com.dev.delta.repositories.LaundryItemRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.repositories.RoleRepository;
import com.dev.delta.repositories.RoomRepository;
import com.dev.delta.repositories.ServiceRepository;
import com.dev.delta.repositories.UserRepository;
import com.dev.delta.repositories.VATRepository;
import com.dev.delta.security.UserPrincipal;
import com.dev.delta.services.BedService;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.FoodService;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.InvoiceService;
import com.dev.delta.services.RoomService;
import com.dev.delta.services.RoomTypeService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class CheckInController {

	/**
	 * checkInService
	 */
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
	EmailService emailService;

	@Autowired
	EmailSettingRepository emailSettingRepository;

	@Autowired
	FoodService foodService;

	@Autowired
	CustomerService customerService;

	@Autowired
	RoomService roomService;

	@Autowired
	ServiceRepository serviceRepository;

	@Autowired
	VATRepository vatRepository;

	@Autowired
	InvoiceRepository invoiceRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BedService bedService;
	@Autowired
	InformationService informationService;
	@Autowired
	CheckInI18nRepository checkInI18nRepository;
	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	ExtraBedI18nRepository extraBedI18nRepository;

	@Autowired
	FoodOrderI18nRepository foodOrderI18nRepository;

	@Autowired
	HouseKeepingOrderI18nRepository houseKeepingOrderI18nRepository;

	@Autowired
	LaundryItemI18nRepository laundryItemI18nRepository;

	@Autowired
	LaundryItemRepository laundryItemRepository;

	@Autowired
	LaundryOrderI18nRepository laundryOrderI18nRepository;

	@Autowired
	NotificationRepository notificationRepository;

	Notification notification;

	Invoice invoice;
	
	@Autowired
	RoleRepository  roleRepository;
	
	@Autowired
	UserRepository   userRepository;
	
	@Autowired
	InvoiceService  invoiceService;
	
	@Autowired
	RoomRepository roomRepository  ;
	
	
	

	@GetMapping("/add-checkin")
	public String getaddCheckIn(Model model) {
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		model.addAttribute("rooms",roomRepository.findFreeRooms() );

		String lang = informationService.getSeletedLang();
		CheckInI18n checkI18n = checkInI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", checkI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "checkin/add";
	}

	/**
	 * getCheckIns
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/checkins")
	public String getCheckIns(Model model) {
		List<CheckIn> checkIns = checkInService.getCheckIns();

		model.addAttribute("items", checkIns);
		String lang = informationService.getSeletedLang();
		CheckInI18n checkI18n = checkInI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", checkI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "checkin/checkins";
	}

	@GetMapping("/checkinsclient")
	public String getCheckInsClient(Model model) {

		UserPrincipal principal = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = principal.getUser();
		Customer customer = customerRepository.findByUser(user);
		List<CheckIn> checkIns = checkInService.getCheckInByCustomer(customer);
		model.addAttribute("items", checkIns);

		String lang = informationService.getSeletedLang();
		CheckInI18n checkI18n = checkInI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", checkI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "checkin/checkinsclient";
	}

	/**
	 * addCheckIn
	 * 
	 * @param checkIn
	 * @return
	 * @throws IOException
	 * @throws MessagingException
	 * @throws AddressException
	 */
	@PostMapping("/addcheckin")

	public String addCheckIn(CheckIn checkIn) throws AddressException, MessagingException, IOException {
		
		sendEmail(checkIn);
		
		
		
		
		Role role=new Role();
		role.setName("CLIENT");
		roleRepository.save(role);
		
		User user=new User();
		user.setPassword("user");
		user.setUsername("user");
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
		checkInService.save(checkIn);
		
		notification = new Notification();
		notification.setDate(new Date().toString());
		notification.setName("New checkin added by " + checkIn.getFullname());
		notificationRepository.save(notification);

		invoice = new Invoice();
		invoice.setCheckIn(checkIn);
		invoice.setCreateAt(new Date().toString());
		invoice.setPrice(checkIn.getRoom().getRoomType().getBasePrice());
		invoice.setService("Booking room no" + checkIn.getRoom().getRoomNo());
		invoiceRepository.save(invoice);
		
		
	     Room room=checkIn.getRoom();
	     room.setStatus("Inactive"); 
	     roomRepository.save(room);
		
		

		return "redirect:/checkins";
	}

	@PostMapping("/addcheckinuser")
	public String addCheckInUser(CheckIn checkIn) throws AddressException, MessagingException, IOException {

		checkInService.save(checkIn);
		sendEmail(checkIn);
		notification = new Notification();
		notification.setDate(new Date().toString());
		notification.setName("New checkin added by " + checkIn.getFullname());
		notificationRepository.save(notification);
		return "redirect:/";
	}

	void sendEmail(CheckIn checkIn) throws AddressException, MessagingException, IOException {
		String subject = "";
		String body = "Dear " + checkIn.getFullname()
				+ "This email is to confirm your booking  on {booking_date} for a single room for {number_of_night} nights with breakfast at the {website_title}."
				+ " The check-in date shall be on " + checkIn.getCheckIn() + " and the check-out date shall " + "be on "
				+ checkIn.getCheckOut() + "." + "Further details of your booking are listed below";
		Long id = 1L;

		EmailSetting emailSetting = emailSettingRepository.getById(id);
		if (!checkIn.getEmail().equals("") && !emailSetting.getPassword().equals("")) {
			emailService.sendmail(emailSetting.getAuth(), emailSetting.getEnableTLS(), emailSetting.getHost(),
					emailSetting.getPort(), emailSetting.getEmail(), checkIn.getEmail(), emailSetting.getPassword(),
					body, subject);
		}
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/checkin/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		CheckIn checkIn = checkInService.findById(id);
		model.addAttribute("item", checkIn);
		String lang = informationService.getSeletedLang();
		CheckInI18n checkI18n = checkInI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", checkI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "checkin/view";
	}
	
	
	@RequestMapping("/checkinclient/{id}")
	public String findByIdClient(@PathVariable("id") Long id, Model model) {
		CheckIn checkIn = checkInService.findById(id);
		model.addAttribute("item", checkIn);
		String lang = informationService.getSeletedLang();
		CheckInI18n checkI18n = checkInI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", checkI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "checkin/viewclient";
	}

	/**
	 * updateCheckIn
	 * 
	 * @param id
	 * @param checkIn
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecheckin/{id}")
	public String updateCheckIn(@PathVariable("id") long id, @Validated CheckIn checkIn, BindingResult result,
			Model model) {

		CheckIn checkin = checkInService.save(checkIn);
		Invoice invoice=new Invoice();
		invoice.setCheckIn(checkin);
		invoice.setService(checkin.getRoom().getRoomType().getTitle());
		invoice.setPrice(checkin.getRoom().getRoomType().getBasePrice());
		invoice.setCreateAt(new Date().toString());
		invoiceRepository.save(invoice);
		return "redirect:/checkins";
	}

	/**
	 * deleteCheckIn
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecheckin/{id}")
	@Transactional
	public String deleteCheckIn(@PathVariable("id") Long id) {
		checkInService.delete(id);
		return "redirect:/checkins";
	}

	@RequestMapping("/editcheckin/{id}")
	public String findCheckInById(@PathVariable("id") Long id, Model model) {
		CheckIn amenity = checkInService.findById(id);
		model.addAttribute("item", amenity);
		return "blog/edit";
	}

	@GetMapping("/orderfood/{id}/{check}")
	public String OrderFood(@PathVariable("id") Long id, @PathVariable("check") Long checkId, Model model) {
		// Customer customer=customerService.findById(id).get();
		Room room = roomService.findById(id).get();

		List<Food> foods = foodService.getFoods();
		model.addAttribute("room", room);
		model.addAttribute("foods", foods);
		model.addAttribute("checkin", checkInService.findById(checkId));
		model.addAttribute("customer", checkInService.findById(checkId).getCutomer());

		String lang = informationService.getSeletedLang();
		FoodOrderI18n foodI18n = foodOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", foodI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "checkin/orderfood";
	}

	@GetMapping("/orderlaundry/{id}/{check}")
	public String OrderLaundry(@PathVariable("id") Long id, @PathVariable("check") Long checkId, Model model) {
		Room room = roomService.findById(id).get();
		List<LaundryItem> laundries = laundryItemRepository.findAll();
		model.addAttribute("room", room);
		model.addAttribute("laundriess", laundries);
		laundries.forEach(e -> {
			System.err.println(e.getName());
		});
		model.addAttribute("checkin", checkInService.findById(checkId));
		model.addAttribute("customer", checkInService.findById(checkId).getCutomer());

		String lang = informationService.getSeletedLang();
		LaundryOrderI18n laundryI18n = laundryOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", laundryI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "checkin/orderlaundry";
	}

	@GetMapping("/orderextrabed/{id}/{check}")
	public String OrderExtraBed(@PathVariable("id") Long id, @PathVariable("check") Long checkId, Model model) {
		Room room = roomService.findById(id).get();
		model.addAttribute("beds", bedService.getBeds());
		model.addAttribute("room", room);
		model.addAttribute("checkin", checkInService.findById(checkId));
		model.addAttribute("customer", checkInService.findById(checkId).getCutomer());

		String lang = informationService.getSeletedLang();
		ExtraBedI18n extrabed = extraBedI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", extrabed);
		menuHeaderUtil.getMenuHeader(model);
		return "checkin/orderextrabed";
	}

	@GetMapping("/orderhousekeeping/{id}/{check}")
	public String orderHouseKeeping(@PathVariable("id") Long id, @PathVariable("check") Long checkId, Model model) {
		Room room = roomService.findById(id).get();
		model.addAttribute("room", room);
		model.addAttribute("checkin", checkInService.findById(checkId));
		model.addAttribute("customer", checkInService.findById(checkId).getCutomer());

		String lang = informationService.getSeletedLang();
		HouseKeepingOrderI18n housekeepingI18n = houseKeepingOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", housekeepingI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "checkin/orderhousekeeping";
	}

	@GetMapping("/viewinvoice/{id}")
	public String viewInvoice(@PathVariable("id") Long id, Model model) {
		CheckIn checkIn = checkInService.findById(id);
		InformationHotel informationHotel = informationService.findById(1L);
		List<Invoice> invoices = invoiceRepository.findByCheckIn(checkIn);
		double subtotal=invoiceService.calculateSubTotalPrice(invoiceRepository);
		double total=invoiceService.calculatetotalPrice(invoiceRepository);
		double vatrate=invoiceService.calculatevatrate(invoiceRepository);
		model.addAttribute("invoices", invoices);
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("checkin", checkIn);
		model.addAttribute("subtotal", subtotal);
		model.addAttribute("total", total);
		model.addAttribute("vatrate", vatrate);
		model.addAttribute("ref", generateRefInvoice());
		model.addAttribute("date", new Date().toString());

		
		
		return "invoice/view";
	}
	
	private String generateRefInvoice()
	{
		 String zeros = "000000";
		    Random rnd = new Random();
		    String s = Integer.toString(rnd.nextInt(0X1000000), 16);
		    s = zeros.substring(s.length()) + s;
		    
		    return s;
	}

	@GetMapping("/checkout/{id}")
	public String checkOut(@PathVariable("id") Long id, Model model) {
		CheckIn checkIn = checkInService.findById(id);
		model.addAttribute("item", checkIn);
		checkIn.setStatus("CheckOut");
		checkInService.save(checkIn);
		Invoice invoice = new Invoice();
		VAT vat = new VAT();
		vatRepository.save(vat);
		// create invoice
		/*
		 * invoice.setCreateAt(new Date().toString());
		 * System.err.println(serviceRepository.findByCheckin(checkIn).size());
		 * invoice.setItems(serviceRepository.findByCheckin(checkIn));
		 * invoice.setVat(vat); invoice.setTotal("199779"); invoice.setCheckIn(checkIn);
		 */
		invoiceRepository.save(invoice);

		return "redirect:/checkins";
	}

}
