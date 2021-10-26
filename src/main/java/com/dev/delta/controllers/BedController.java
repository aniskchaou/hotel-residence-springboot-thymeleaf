package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Amenity;
import com.dev.delta.entities.Bed;
import com.dev.delta.services.BedService;

@Controller
public class BedController {

	@Autowired
	BedService bedService;
	
	
	@GetMapping("/beds")
	public String getBlogs(Model model) {
		List<Bed> beds=bedService.getBeds();
		model.addAttribute("items", beds);
		
		return "bed/beds";
	}
	
	@GetMapping("/add-bed")
	public String getaddBed(Model model) {
		return "bed/add";
	}
	
	@PostMapping("/addbed")
	public String addBed(Bed bed) {
		bedService.save(bed);
		return "redirect:/beds";
	}
	
	
	@RequestMapping("/editbed/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Bed bed = bedService.findById(id);
		model.addAttribute("item", bed);
		return "bed/edit";
	}
}
