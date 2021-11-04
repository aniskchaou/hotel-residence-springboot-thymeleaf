package com.dev.delta.controllers;

import java.io.IOException;
import java.text.ParseException;
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
import org.springframework.web.servlet.view.RedirectView;

import com.dev.delta.entities.Amenity;
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

	@PostMapping("/updateblogcategory/{id}")
	public String updateBlogcategory(@PathVariable("id") long id, @Validated BlogCategory blogCategory, BindingResult result, Model model) {

		blogCategoryService.save(blogCategory);
		return "redirect:/blogcategoriesadmin";
	}
	
	
	@PostMapping("/addblogcategory")
	public RedirectView saveBlogcategory(BlogCategory blogcategory) throws IOException, ParseException {
	    blogCategoryService.save(blogcategory);
		return new RedirectView("/blogcategoriesadmin", true);
	}
	
	@RequestMapping("/editblogcategory/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		BlogCategory blog = blogCategoryService.findById(id);
		model.addAttribute("item", blog);
		return "blogcategory/edit";
	}
	
	@GetMapping("/deleteblogcategory/{id}")
	@Transactional
	public String deleteBlogCategory(@PathVariable("id") Long id) {
		blogCategoryService.delete(id);
		return "redirect:/blogcategoriesadmin";
	}
}
