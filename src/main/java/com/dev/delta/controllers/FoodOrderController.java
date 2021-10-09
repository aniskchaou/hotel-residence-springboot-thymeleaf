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

import com.dev.delta.entities.FoodOrder;
import com.dev.delta.services.FoodOrderService;

@Controller
public class FoodOrderController {
	/**
	 * foodOrderService
	 */
	@Autowired
	private FoodOrderService foodOrderService;

	/**
	 * getFoodOrders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/foodorders")
	public String getFoodOrders(Model model) {
		List<FoodOrder> foodOrders = foodOrderService.getFoodOrders();
	
		model.addAttribute("cities", foodOrders);
	
		return "foodOrder/cities";
	}

	/**
	 * addFoodOrder
	 * 
	 * @param foodOrder
	 * @return
	 */
	@PostMapping("/addfoodOrder")

	public String addFoodOrder(FoodOrder foodOrder) {
		foodOrderService.save(foodOrder);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/foodOrder/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		FoodOrder foodOrder = foodOrderService.findById(id).get();
		model.addAttribute("foodOrder", foodOrder);
		return "editActivities";
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
	@PostMapping("/updatefoodOrder/{id}")
	public String updateFoodOrder(@PathVariable("id") long id, @Validated FoodOrder foodOrder, BindingResult result, Model model) {

		foodOrderService.save(foodOrder);
		return "redirect:/cities";
	}

	/**
	 * deleteFoodOrder
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefoodOrder/{id}")
	@Transactional
	public String deleteFoodOrder(@PathVariable("id") Long id) {
		foodOrderService.delete(id);
		return "redirect:/cities";
	}


}
