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

import com.dev.delta.entities.GuestType;
import com.dev.delta.services.GuestTypeService;

@Controller
public class GuestTypeController {
	/**
	 * guesTypeService
	 */
	@Autowired
	private GuestTypeService guesTypeService;

	
	/**
	 * getGuestTypes
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/guesttypes")
	public String getGuestTypes(Model model) {
		List<GuestType> guesTypes = guesTypeService.getGuestTypes();

		model.addAttribute("cities", guesTypes);
	
		return "guesType/cities";
	}

	/**
	 * addGuestType
	 * 
	 * @param guesType
	 * @return
	 */
	@PostMapping("/addguesType")

	public String addGuestType(GuestType guesType) {
		guesTypeService.save(guesType);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/guesType/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		GuestType guesType = guesTypeService.findById(id).get();
		model.addAttribute("guesType", guesType);
		return "editActivities";
	}

	/**
	 * updateGuestType
	 * 
	 * @param id
	 * @param guesType
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateguesType/{id}")
	public String updateGuestType(@PathVariable("id") long id, @Validated GuestType guesType, BindingResult result, Model model) {

		guesTypeService.save(guesType);
		return "redirect:/cities";
	}

	/**
	 * deleteGuestType
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteguesType/{id}")
	@Transactional
	public String deleteGuestType(@PathVariable("id") Long id) {
		guesTypeService.delete(id);
		return "redirect:/cities";
	}
}
