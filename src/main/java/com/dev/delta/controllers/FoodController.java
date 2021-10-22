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

import com.dev.delta.entities.Food;
import com.dev.delta.services.FoodCategoryService;
import com.dev.delta.services.FoodService;

@Controller
public class FoodController {
	/**
	 * foodService
	 */
	@Autowired
	private FoodService foodService;

	@Autowired
	private FoodCategoryService foodCategoryService;

	@GetMapping("/add-food")
	public String getaddFood(Model model) {
		model.addAttribute("foodCategories",foodCategoryService.getFoodCategorys());
		return "food/add";
	}
	
	/**
	 * getFoods
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/foods")
	public String getFoods(Model model) {
		List<Food> foods = foodService.getFoods();
		model.addAttribute("items", foods);
		
		return "food/foods";
	}

	/**
	 * addFood
	 * 
	 * @param food
	 * @return
	 */
	@PostMapping("/addfood")

	public String addFood(Food food) {
		foodService.save(food);
		return "redirect:/foods";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/food/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Food food = foodService.findById(id).get();
		model.addAttribute("food", food);
		return "editActivities";
	}

	/**
	 * updateFood
	 * 
	 * @param id
	 * @param food
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatefood/{id}")
	public String updateFood(@PathVariable("id") long id, @Validated Food food, BindingResult result, Model model) {

		foodService.save(food);
		return "redirect:/foods";
	}

	/**
	 * deleteFood
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefood/{id}")
	@Transactional
	public String deleteFood(@PathVariable("id") Long id) {
		foodService.delete(id);
		return "redirect:/foods";
	}
}
