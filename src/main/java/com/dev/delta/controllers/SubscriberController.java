package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.delta.entities.Amenity;
import com.dev.delta.entities.Shift;
import com.dev.delta.entities.Subscriber;
import com.dev.delta.services.SubscriberService;

@Controller
public class SubscriberController {

	@Autowired
	SubscriberService  subscriberService;
	
	
	@GetMapping("/subscribers")
	public String getSubscribers(Model model) {
		List<Subscriber> subscribers = subscriberService.getSubcribers();
		model.addAttribute("items", subscribers);
		return "subscriber/subscribers";
	}
	
	@PostMapping("/addsubscriber")
	public String addShift(Subscriber subscriber) {
		subscriberService.save(subscriber);
		return "redirect:/";
	}
	
	
	@GetMapping("/deletesubscriber/{id}")
	@Transactional
	public String deleteRoom(@PathVariable("id") Long id) {
		subscriberService.delete(id);
		return "redirect:/subscribers";
	}
}
