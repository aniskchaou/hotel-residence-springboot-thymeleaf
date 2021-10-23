package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.BlogCategoryService;

@Service
public class BlogCategoryDTO implements DTO {

	@Autowired
	BlogCategoryService blogCategoryService;
	
	@Override
	public void populate() {
		
		blogCategory.setName("Travel");
		blogCategory1.setName("Restaurant");
		blogCategory2.setName("Inspiration");
		blogCategory3.setName("Product");
		blogCategoryService.save(blogCategory);
		blogCategoryService.save(blogCategory1);
		blogCategoryService.save(blogCategory2);
		blogCategoryService.save(blogCategory3);

	}

}
