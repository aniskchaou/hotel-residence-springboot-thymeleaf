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

import com.dev.delta.entities.Housekeping;
import com.dev.delta.services.HousekepingService;

@Controller
public class HousekepingController {
	/**
	 * housekeepingService
	 */
	@Autowired
	private HousekepingService housekeepingService;

	
	/**
	 * getHousekeepings
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/housekeepings")
	public String getHousekeepings(Model model) {
		List<Housekeping> housekeepings = housekeepingService.getHousekeepings();
		
		model.addAttribute("cities", housekeepings);
	
		return "housekeeping/cities";
	}

	/**
	 * addHousekeeping
	 * 
	 * @param housekeeping
	 * @return
	 */
	@PostMapping("/addhousekeeping")

	public String addHousekeeping(Housekeping housekeeping) {
		housekeepingService.save(housekeeping);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/housekeeping/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Housekeping housekeeping = housekeepingService.findById(id).get();
		model.addAttribute("housekeeping", housekeeping);
		return "editActivities";
	}

	/**
	 * updateHousekeeping
	 * 
	 * @param id
	 * @param housekeeping
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatehousekeeping/{id}")
	public String updateHousekeeping(@PathVariable("id") long id, @Validated Housekeping housekeeping, BindingResult result, Model model) {

		housekeepingService.save(housekeeping);
		return "redirect:/cities";
	}

	/**
	 * deleteHousekeeping
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletehousekeeping/{id}")
	@Transactional
	public String deleteHousekeeping(@PathVariable("id") Long id) {
		housekeepingService.delete(id);
		return "redirect:/cities";
	}
}
