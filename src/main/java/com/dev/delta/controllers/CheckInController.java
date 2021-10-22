package com.dev.delta.controllers;

import java.util.List;

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
	 */
	@PostMapping("/addcheckin")

	public String addCheckIn(CheckIn checkIn) {
		checkInService.save(checkIn);
		
		return "redirect:/checkins";
	}
	
	
	@PostMapping("/addcheckinuser")

	public String addCheckInUser(CheckIn checkIn) {
		checkInService.save(checkIn);
		
		return "redirect:/";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/checkin/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		CheckIn checkIn = checkInService.findById(id).get();
		model.addAttribute("checkIn", checkIn);
		return "editActivities";
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
}
