package com.dev.delta.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.Bed;

@Controller
public class GalleryController {

	@GetMapping("/galleryadmin")
	public String getGallery(Model model) {
		return "gallery/galleries";
	}
}
