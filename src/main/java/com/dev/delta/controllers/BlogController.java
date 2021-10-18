package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.Blog;
import com.dev.delta.services.BlogService;

@Controller
public class BlogController {

	
	@Autowired
	BlogService blogService;
	
	
	@GetMapping("/blogsadmin")
	public String getBlogs(Model model) {
		List<Blog> blogs = blogService.getBlogs();
		model.addAttribute("items", blogs);
		
		return "blog/blogs";
	}
}
