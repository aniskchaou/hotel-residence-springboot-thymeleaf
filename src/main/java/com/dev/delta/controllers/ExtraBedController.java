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

import com.dev.delta.entities.ExtraBed;
import com.dev.delta.services.ExtraBedService;

@Controller
public class ExtraBedController {
	/**
	 * extraBedService
	 */
	@Autowired
	private ExtraBedService extraBedService;

	
	/**
	 * getExtraBeds
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/extrabeds")
	public String getExtraBeds(Model model) {
		List<ExtraBed> extraBeds = extraBedService.getExtraBeds();
	
		model.addAttribute("cities", extraBeds);
	
		return "extraBed/cities";
	}

	/**
	 * addExtraBed
	 * 
	 * @param extraBed
	 * @return
	 */
	@PostMapping("/addextraBed")

	public String addExtraBed(ExtraBed extraBed) {
		extraBedService.save(extraBed);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/extraBed/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ExtraBed extraBed = extraBedService.findById(id).get();
		model.addAttribute("extraBed", extraBed);
		return "editActivities";
	}

	/**
	 * updateExtraBed
	 * 
	 * @param id
	 * @param extraBed
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateextraBed/{id}")
	public String updateExtraBed(@PathVariable("id") long id, @Validated ExtraBed extraBed, BindingResult result, Model model) {

		extraBedService.save(extraBed);
		return "redirect:/cities";
	}

	/**
	 * deleteExtraBed
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteextraBed/{id}")
	@Transactional
	public String deleteExtraBed(@PathVariable("id") Long id) {
		extraBedService.delete(id);
		return "redirect:/cities";
	}
}
