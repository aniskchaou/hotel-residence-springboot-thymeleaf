package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.FoodService;

@Service
public class FoodDTO implements DTO {

	@Autowired
	FoodService foodService;
	
	@Override
	public void populate() {
	
		food.setCategory(foodCategory);
		food.setPrice("18");
		food.setItemName("qdfsd");
		food.setStatus("Active");
		foodService.save(food);
		
	}

}
