package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
