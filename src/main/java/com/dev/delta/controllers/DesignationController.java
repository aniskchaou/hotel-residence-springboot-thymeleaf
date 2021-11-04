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

import com.dev.delta.entities.Designation;
import com.dev.delta.services.DesignationService;

@Controller
public class DesignationController {
	/**
	 * designationService
	 */
	@Autowired
	private DesignationService designationService;

	@GetMapping("/add-designation")
	public String getaddDesignation(Model model) {
		return "designation/add";
	}
	
	/**
	 * getDesignations
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/designations")
	public String getDesignations(Model model) {
		List<Designation> designations = designationService.getDesignations();

		model.addAttribute("items", designations);

		return "designation/designations";
	}

	/**
	 * addDesignation
	 * 
	 * @param designation
	 * @return
	 */
	@PostMapping("/adddesignation")

	public String addDesignation(Designation designation) {
		designationService.save(designation);
		return "redirect:/designations";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editdesignation/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		Designation designation = designationService.findById(id).get();
		model.addAttribute("item", designation);
		return "designation/edit";
	}
	

	/**
	 * updateDesignation
	 * 
	 * @param id
	 * @param designation
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatedesignation/{id}")
	public String updateDesignation(@PathVariable("id") long id, @Validated Designation designation, BindingResult result, Model model) {

		designationService.save(designation);
		return "redirect:/designations";
	}

	/**
	 * deleteDesignation
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletedesignation/{id}")
	@Transactional
	public String deleteDesignation(@PathVariable("id") Long id) {
		designationService.delete(id);
		return "redirect:/designations";
	}
}
