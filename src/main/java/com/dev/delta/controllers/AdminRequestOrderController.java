package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.ExtraBedRequestOrder;
import com.dev.delta.entities.FoodRequestOrder;
import com.dev.delta.entities.HouseKeepingRequestOrder;
import com.dev.delta.entities.LaundryRequestOrder;
import com.dev.delta.services.ExtraBedRequestService;
import com.dev.delta.services.FoodRequestOrderService;
import com.dev.delta.services.HouseKeepingRequestOrderService;
import com.dev.delta.services.LaundryRequestOrderService;

@Controller
public class AdminRequestOrderController {

	@Autowired
	ExtraBedRequestService extraBedRequestService;
	
	@Autowired
	HouseKeepingRequestOrderService  houseKeepingRequestOrderService;
	
	@Autowired
	FoodRequestOrderService  foodRequestOrderService;
	
	@Autowired
	LaundryRequestOrderService  laundryRequestOrderService;
	
	
	@GetMapping("/extrabedadminrequest")
	public String getextrabedsAdminRequest(Model model) {
		List<ExtraBedRequestOrder> items = extraBedRequestService.getExtraBedRequest();
		model.addAttribute("items", items);
		return "adminrequest/extrabedrequest";
	}
	

	@GetMapping("/laundryadminrequest")
	public String getLaundryAdminRequest(Model model) {
		//List<HouseKeepingRequestOrder> items = houseKeepingRequestOrderService.gethousekeepingRequest();
		//model.addAttribute("items", items);
		return "adminrequest/laundryrequest";
	}
	
	
	@GetMapping("/housekeepingadminrequest")
	public String getHouseKeepingAdminRequest(Model model) {
		List<HouseKeepingRequestOrder> items = houseKeepingRequestOrderService.gethousekeepingRequest();
		model.addAttribute("items", items);
		return "adminrequest/housekeepingrequest";
	}
	
	@GetMapping("/foodadminrequest")
	public String getFoodOrderAdminRequest(Model model) {
		List<FoodRequestOrder> items = foodRequestOrderService.getFoodRequest();
		model.addAttribute("items", items);
		return "adminrequest/foodrequest";
	}
	
	
	
	
}
