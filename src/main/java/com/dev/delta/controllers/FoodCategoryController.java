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

import com.dev.delta.entities.FoodCategory;
import com.dev.delta.services.FoodCategoryService;

@Controller
public class FoodCategoryController {
	/**
	 * foodCategoryService
	 */
	@Autowired
	private FoodCategoryService foodCategoryService;


	/**
	 * getFoodCategorys
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/foodcategories")
	public String getFoodCategorys(Model model) {
		List<FoodCategory> foodCategorys = foodCategoryService.getFoodCategorys();
	
		model.addAttribute("cities", foodCategorys);
	
		return "foodCategory/cities";
	}

	/**
	 * addFoodCategory
	 * 
	 * @param foodCategory
	 * @return
	 */
	@PostMapping("/addfoodCategory")

	public String addFoodCategory(FoodCategory foodCategory) {
		foodCategoryService.save(foodCategory);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/foodCategory/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		FoodCategory foodCategory = foodCategoryService.findById(id).get();
		model.addAttribute("foodCategory", foodCategory);
		return "editActivities";
	}

	/**
	 * updateFoodCategory
	 * 
	 * @param id
	 * @param foodCategory
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatefoodCategory/{id}")
	public String updateFoodCategory(@PathVariable("id") long id, @Validated FoodCategory foodCategory, BindingResult result, Model model) {

		foodCategoryService.save(foodCategory);
		return "redirect:/cities";
	}

	/**
	 * deleteFoodCategory
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefoodCategory/{id}")
	@Transactional
	public String deleteFoodCategory(@PathVariable("id") Long id) {
		foodCategoryService.delete(id);
		return "redirect:/cities";
	}
	
}
