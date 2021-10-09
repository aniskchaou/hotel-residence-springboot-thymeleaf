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

import com.dev.delta.entities.Shift;
import com.dev.delta.services.ShiftService;

@Controller
public class ShiftController {
	/**
	 * shiftService
	 */
	@Autowired
	private ShiftService shiftService;


	/**
	 * getShifts
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/shifts")
	public String getShifts(Model model) {
		List<Shift> shifts = shiftService.getShifts();

		model.addAttribute("cities", shifts);
	
		return "shift/cities";
	}

	/**
	 * addShift
	 * 
	 * @param shift
	 * @return
	 */
	@PostMapping("/addshift")

	public String addShift(Shift shift) {
		shiftService.save(shift);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/shift/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Shift shift = shiftService.findById(id).get();
		model.addAttribute("shift", shift);
		return "editActivities";
	}

	/**
	 * updateShift
	 * 
	 * @param id
	 * @param shift
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateshift/{id}")
	public String updateShift(@PathVariable("id") long id, @Validated Shift shift, BindingResult result, Model model) {

		shiftService.save(shift);
		return "redirect:/cities";
	}

	/**
	 * deleteShift
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteshift/{id}")
	@Transactional
	public String deleteShift(@PathVariable("id") Long id) {
		shiftService.delete(id);
		return "redirect:/cities";
	}
}
