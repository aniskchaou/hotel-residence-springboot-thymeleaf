package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.BlogCategoryI18nRepository;
import com.dev.delta.services.BlogCategoryService;

@Service
public class BlogCategoryDTO implements DTO {

	@Autowired
	BlogCategoryService blogCategoryService;
	
	@Autowired
	BlogCategoryI18nRepository  blogCategoryI18nRepository;
	
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
		
		blogCategoryI18n.setLangI18n("EN");
		blogCategoryI18n.setNameI18n("Category Name");
		
		blogCategoryI18nRepository.save(blogCategoryI18n);

	}

}
