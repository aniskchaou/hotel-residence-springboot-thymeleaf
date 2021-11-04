package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.delta.entities.Gallery;
import com.dev.delta.services.GalleryService;

@Controller
public class GalleryController {

	@Autowired
	GalleryService  galleryService;
	
	@GetMapping("/galleries")
	public String getGallery(Model model) {
		List<Gallery> galleries = galleryService.getGalleries();

		model.addAttribute("items", galleries);
	
		return "gallery/galleries";
	}
	
	@GetMapping("/add-gallery")
	public String addGallery(Model model) {
		return "gallery/add";
	}
	
	@PostMapping("/addgallery")
	public String addFood(Gallery gallery) {
		galleryService.save(gallery);
		return "redirect:/galleries";
	}
	
	
	@GetMapping("/deletegallery/{id}")
	@Transactional
	public String deleteGallery(@PathVariable("id") Long id) {
		galleryService.delete(id);
		return "redirect:/galleries";
	}
}
