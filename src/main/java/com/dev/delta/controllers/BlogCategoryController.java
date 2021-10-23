package com.dev.delta.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.dev.delta.entities.BlogCategory;
import com.dev.delta.services.BlogCategoryService;

@Controller
public class BlogCategoryController {


	@Autowired
	BlogCategoryService blogCategoryService;

	@GetMapping("/blogcategoriesadmin")
	public String getBlogcategorys(Model model) {
		List<BlogCategory> blogcategorys = blogCategoryService.getBlogCategories();
		model.addAttribute("items", blogcategorys);
		return "blogcategory/blogcategories";
	}

	@GetMapping("/add-blogcategory")
	public String getBlogcategory(Model model) {
		return "blogcategory/add";
	}

	@PostMapping("/addblogcategory")
	public RedirectView saveBlogcategory(BlogCategory blogcategory) throws IOException, ParseException {
	    blogCategoryService.save(blogcategory);
		return new RedirectView("/blogcategoriesadmin", true);
	}
}
