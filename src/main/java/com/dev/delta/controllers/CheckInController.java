package com.dev.delta.controllers;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.GuestTypeService;
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
	EmailSettingRepository  emailSettingRepository;

	@GetMapping("/add-checkin")
	public String getaddCheckIn(Model model) {
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
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
		//sendEmail(checkIn);
		return "redirect:/";
	}
	
	
	void sendEmail(CheckIn checkIn) throws AddressException, MessagingException, IOException
	{
		String subject="";
		String body="Dear "+checkIn.getFullname()
				+ "This email is to confirm your booking  on {booking_date} for a single room for {number_of_night} nights with breakfast at the {website_title}."
				+ " The check-in date shall be on "+checkIn.getCheckIn()+" and the check-out date shall "
						+ "be on "+checkIn.getCheckOut()+"."
				+ "Further details of your booking are listed below";
		 Long id=1L;
		 
		   EmailSetting emailSetting=emailSettingRepository.getById(id);
		   emailService.sendmail(emailSetting.getAuth(),
				   emailSetting.getEnableTLS(),
				   emailSetting.getHost(),
				   emailSetting.getPort(),
				   emailSetting.getEmail(),
				   checkIn.getEmail(),
				   emailSetting.getPassword(),
				   body,
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
	public String updateCheckIn(@PathVariable("id") long id, @Validated CheckIn checkIn, BindingResult result, Model model) {

		checkInService.save(checkIn);
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
}
