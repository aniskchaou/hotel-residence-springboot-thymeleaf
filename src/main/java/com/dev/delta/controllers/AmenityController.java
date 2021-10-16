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

import com.dev.delta.entities.Amenity;
import com.dev.delta.services.AmenityService;

@Controller
public class AmenityController {
	/**
	 * amenityService
	 */
	@Autowired
	private AmenityService amenityService;

	@GetMapping("/add-amenity")
	public String getaddAmenity(Model model) {
		List<Amenity> amenitys = amenityService.getAmenitys();
		
		model.addAttribute("cities", amenitys);
		
		return "amenity/add";
	}
	
	/**
	 * getAmenitys
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/amenities")
	public String getAmenitys(Model model) {
		List<Amenity> amenitys = amenityService.getAmenitys();
		
		model.addAttribute("items", amenitys);
		
		return "amenity/amenities";
	}

	/**
	 * addAmenity
	 * 
	 * @param amenity
	 * @return
	 */
	@PostMapping("/addamenity")

	public String addAmenity(Amenity amenity) {
		amenityService.save(amenity);
		return "redirect:/amenities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/amenity/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Amenity amenity = amenityService.findById(id).get();
		model.addAttribute("amenity", amenity);
		return "editActivities";
	}

	/**
	 * updateAmenity
	 * 
	 * @param id
	 * @param amenity
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateamenity/{id}")
	public String updateAmenity(@PathVariable("id") long id, @Validated Amenity amenity, BindingResult result, Model model) {

		amenityService.save(amenity);
		return "redirect:/amenities";
	}

	/**
	 * deleteAmenity
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteamenity/{id}")
	@Transactional
	public String deleteAmenity(@PathVariable("id") Long id) {
		amenityService.delete(id);
		return "redirect:/amenities";
	}
	
}
