package com.dev.delta.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.List;

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
import com.dev.delta.entities.Invoice;
import com.dev.delta.entities.Room;
import com.dev.delta.entities.Service;
import com.dev.delta.entities.User;
import com.dev.delta.entities.VAT;
import com.dev.delta.repositories.BedRepository;
import com.dev.delta.repositories.CustomerRepository;
import com.dev.delta.repositories.InvoiceRepository;
import com.dev.delta.repositories.ServiceRepository;
import com.dev.delta.repositories.VATRepository;
import com.dev.delta.security.UserPrincipal;
import com.dev.delta.services.BedService;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.FoodService;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.RoomService;
import com.dev.delta.services.RoomTypeService;

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
	BedService  bedService;
	
	

	@GetMapping("/add-checkin")
	public String getaddCheckIn(Model model) {
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		model.addAttribute("rooms", roomService.getRooms());
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

		return "checkin/checkins";
	}

	@GetMapping("/checkinsclient")
	public String getCheckInsClient(Model model) {

		UserPrincipal principal = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = principal.getUser();
		Customer customer = customerRepository.findByUser(user);
		List<CheckIn> checkIns = checkInService.getCheckInByCustomer(customer);

		model.addAttribute("items", checkIns);

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
		checkInService.save(checkIn);
		sendEmail(checkIn);
		return "redirect:/checkins";
	}

	@PostMapping("/addcheckinuser")
	public String addCheckInUser(CheckIn checkIn) throws AddressException, MessagingException, IOException {

		checkInService.save(checkIn);
		// sendEmail(checkIn);
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
		emailService.sendmail(emailSetting.getAuth(), emailSetting.getEnableTLS(), emailSetting.getHost(),
				emailSetting.getPort(), emailSetting.getEmail(), checkIn.getEmail(), emailSetting.getPassword(), body,
				subject);
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
		return "checkin/view";
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
		Service service = new Service();
		service.setCheckin(checkin);
		service.setName(checkin.getRoom().getRoomType().getTitle());
		service.setPrice(checkin.getRoom().getRoomType().getBasePrice());
		serviceRepository.save(service);
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
		return "checkin/orderfood";
	}

	@GetMapping("/orderlaundry/{id}/{check}")
	public String OrderLaundry(@PathVariable("id") Long id, @PathVariable("check") Long checkId, Model model) {
		Room room = roomService.findById(id).get();

	
		model.addAttribute("room", room);
	
		model.addAttribute("checkin", checkInService.findById(checkId));
		model.addAttribute("customer", checkInService.findById(checkId).getCutomer());
		return "checkin/orderlaundry";
	}

	@GetMapping("/orderextrabed/{id}/{check}")
	public String OrderExtraBed(@PathVariable("id") Long id, @PathVariable("check") Long checkId, Model model) {
		Room room = roomService.findById(id).get();
		model.addAttribute("beds", bedService.getBeds());
		model.addAttribute("room", room);
		model.addAttribute("checkin", checkInService.findById(checkId));
		model.addAttribute("customer", checkInService.findById(checkId).getCutomer());
		return "checkin/orderextrabed";
	}

	@GetMapping("/orderhousekeeping/{id}/{check}")
	public String orderHouseKeeping(@PathVariable("id") Long id, @PathVariable("check") Long checkId, Model model) {
		Room room = roomService.findById(id).get();
		model.addAttribute("room", room);
		model.addAttribute("checkin", checkInService.findById(checkId));
		model.addAttribute("customer", checkInService.findById(checkId).getCutomer());
		return "checkin/orderhousekeeping";
	}

	@GetMapping("/viewinvoice/{id}")
	public String viewInvoice(@PathVariable("id") Long id, Model model) {
		CheckIn checkIn = checkInService.findById(id);

		Invoice invoice = invoiceRepository.findByCheckIn(checkIn);
		model.addAttribute("invoice", invoice);

		return "invoice/view";
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
		invoice.setCreateAt(new Date().toString());
		System.err.println(serviceRepository.findByCheckin(checkIn).size());
		invoice.setItems(serviceRepository.findByCheckin(checkIn));
		invoice.setVat(vat);
		invoice.setTotal("199779");
		invoice.setCheckIn(checkIn);

		invoiceRepository.save(invoice);

		return "redirect:/checkins";
	}

}
