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

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.FoodOrder;
import com.dev.delta.entities.FoodRequestOrder;
import com.dev.delta.entities.Service;
import com.dev.delta.i18n.entities.CityI18n;
import com.dev.delta.repositories.ServiceRepository;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.FoodOrderService;
import com.dev.delta.services.FoodRequestOrderService;
import com.dev.delta.services.FoodService;

@Controller
public class FoodOrderController {
	/**
	 * foodOrderService
	 */
	@Autowired
	private FoodOrderService foodOrderService;

	@Autowired
	private CustomerService  customerService;
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private CheckInService  checkInService;
	
	@Autowired
	ServiceRepository  serviceRepository;
	
	@GetMapping("/add-foodorder")
	public String getaddAmenity(Model model) {
		model.addAttribute("customers",customerService.getCustomers());
		model.addAttribute("foods",foodService.getFoods());
	
		
		return "foodorder/add";
	}
	
	
	@GetMapping("/foodrequest")
	public String getFoodRequest(Model model) {
		List<FoodOrder> items = foodOrderService.getFoodOrders();
		model.addAttribute("items", items);
		return "request/foodrequestorder";
	}
	
	
	/**
	 * getFoodOrders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/foodorders")
	public String getFoodOrders(Model model) {
		List<FoodOrder> foodOrders = foodOrderService.getFoodOrders();
		model.addAttribute("items", foodOrders);
	
		return "foodorder/foodorders";
	}

	/**
	 * addFoodOrder
	 * 
	 * @param foodOrder
	 * @return
	 */
	@PostMapping("/addfoodorder")

	public String addFoodOrder(FoodOrder foodOrder) {
		foodOrderService.save(foodOrder);
		Service service=new Service();
		service.setName(foodOrder.getFoodItem().getItemName());
		service.setCheckin(foodOrder.getCheckin());
		service.setPrice(foodOrder.getPrice());
		//System.err.println(foodOrder.toString());
		serviceRepository.save(service);
		//return "redirect:/checkins";
		return "redirect:/foodrequest";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editfoodorder/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		FoodOrder foodOrder = foodOrderService.findById(id).get();
		model.addAttribute("item", foodOrder);
		return "foodorder/edit";
	}

	/**
	 * updateFoodOrder
	 * 
	 * @param id
	 * @param foodOrder
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatefoodorder/{id}")
	public String updateFoodOrder(@PathVariable("id") long id, @Validated FoodOrder foodOrder, BindingResult result, Model model) {

		foodOrderService.save(foodOrder);
		return "redirect:/foodorders";
	}

	/**
	 * deleteFoodOrder
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefoodorder/{id}")
	@Transactional
	public String deleteFoodOrder(@PathVariable("id") Long id) {
		foodOrderService.delete(id);
		return "redirect:/foodorders";
	}


}
