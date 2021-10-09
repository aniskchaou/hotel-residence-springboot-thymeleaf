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
@Controller
public class CheckInController {

	/**
	 * checkInService
	 */
	@Autowired
	private CheckInService checkInService;


	/**
	 * getCheckIns
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/checkins")
	public String getCheckIns(Model model) {
		List<CheckIn> checkIns = checkInService.getCheckIns();

		model.addAttribute("cities", checkIns);

		return "checkIn/cities";
	}

	/**
	 * addCheckIn
	 * 
	 * @param checkIn
	 * @return
	 */
	@PostMapping("/addcheckIn")

	public String addCheckIn(CheckIn checkIn) {
		checkInService.save(checkIn);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/checkIn/{id}")
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
	@PostMapping("/updatecheckIn/{id}")
	public String updateCheckIn(@PathVariable("id") long id, @Validated CheckIn checkIn, BindingResult result, Model model) {

		checkInService.save(checkIn);
		return "redirect:/cities";
	}

	/**
	 * deleteCheckIn
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecheckIn/{id}")
	@Transactional
	public String deleteCheckIn(@PathVariable("id") Long id) {
		checkInService.delete(id);
		return "redirect:/cities";
	}
}
