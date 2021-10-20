package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.FoodCategoryService;

@Service
public class FoodCategoryDTO implements DTO {

	@Autowired
	FoodCategoryService foodCategoryService;

	@Override
	public void populate() {

		foodCategory.setName("Beverages");
		foodCategory.setStatus("Active");

		foodCategory2.setName("Breakfast");
		foodCategory2.setStatus("Active");
		
		
		foodCategoryService.save(foodCategory);
		foodCategoryService.save(foodCategory2);

	}

}
