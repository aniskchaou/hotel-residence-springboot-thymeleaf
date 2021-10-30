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
public class RequestOrderController {

	@Autowired
	FoodRequestOrderService foodRequestOrderService;
	@Autowired
	HouseKeepingRequestOrderService houseKeepingRequestOrderService;
	@Autowired
	LaundryRequestOrderService  laundryRequestOrderService;
	@Autowired
	ExtraBedRequestService  extraBedRequestService;
	
	@GetMapping("/extrabedrequest")
	public String getextrabedsRequest(Model model) {
		List<ExtraBedRequestOrder> items = extraBedRequestService.getExtraBedRequest();
		model.addAttribute("items", items);
		return "request/extrabedrequest";
	}
	
	@GetMapping("/foodrequest")
	public String getFoodRequest(Model model) {
		List<FoodRequestOrder> items = foodRequestOrderService.getFoodRequest();
		model.addAttribute("items", items);
		return "request/foodrequestorder";
	}
	
	
	@GetMapping("/housekeepingrequest")
	public String getHouseKeepingRequest(Model model) {
		List<HouseKeepingRequestOrder> items = houseKeepingRequestOrderService.gethousekeepingRequest();
		model.addAttribute("items", items);
		return "request/housekeepingrequestorder";
	}
	
	@GetMapping("/laundryrequest")
	public String getLaundryOrderRequest(Model model) {
		List<LaundryRequestOrder> items = laundryRequestOrderService.getLaundriesRequest();
		model.addAttribute("items", items);
		return "request/laundryrequestorder";
	}
}
