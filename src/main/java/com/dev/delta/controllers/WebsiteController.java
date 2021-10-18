package com.dev.delta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

	@GetMapping("/dashboard")
	public String homeAdmin() {
   
		return "/home/index";
	}
	
	@GetMapping("/")
	public String home() {
   
		return "/website/index";
	}
	
	@GetMapping("/about")
	public String about() {
   
		return "/website/about";
	}
	
	
	@GetMapping("/contact")
	public String contact() {
   
		return "/website/contact";
	}
	
	
	@GetMapping("/blog")
	public String blog() {
   
		return "/website/blog";
	}
}
