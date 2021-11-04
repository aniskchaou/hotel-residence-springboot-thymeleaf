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

import com.dev.delta.entities.Departement;
import com.dev.delta.services.DepartementService;

@Controller
public class DepartementController {
	/**
	 * departementService
	 */
	@Autowired
	private DepartementService departementService;

	@GetMapping("/add-departement")
	public String getaddDepartement(Model model) {
		return "departement/add";
	}
	
	/**
	 * getDepartements
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/departements")
	public String getDepartements(Model model) {
		List<Departement> departements = departementService.getDepartements();
		model.addAttribute("items", departements);

		return "departement/departements";
	}

	/**
	 * addDepartement
	 * 
	 * @param departement
	 * @return
	 */
	@PostMapping("/adddepartement")

	public String addDepartement(Departement departement) {
		departementService.save(departement);
		return "redirect:/departements";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editdepartement/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		Departement departement = departementService.findById(id).get();
		model.addAttribute("item", departement);
		return "departement/edit";
	}

	/**
	 * updateDepartement
	 * 
	 * @param id
	 * @param departement
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatedepartement/{id}")
	public String updateDepartement(@PathVariable("id") long id, @Validated Departement departement, BindingResult result, Model model) {

		departementService.save(departement);
		return "redirect:/departements";
	}

	/**
	 * deleteDepartement
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletedepartement/{id}")
	@Transactional
	public String deleteDepartement(@PathVariable("id") Long id) {
		departementService.delete(id);
		return "redirect:/departements";
	}
}
