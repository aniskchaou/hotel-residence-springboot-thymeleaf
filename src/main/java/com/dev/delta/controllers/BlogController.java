package com.dev.delta.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.dev.delta.entities.Amenity;
import com.dev.delta.entities.Blog;
import com.dev.delta.entities.BlogCategory;
import com.dev.delta.entities.CheckIn;
import com.dev.delta.services.BlogCategoryService;
import com.dev.delta.services.BlogService;
import com.dev.delta.util.DateBlogUtil;
import com.dev.delta.util.FileUploadUtil;

@Controller
public class BlogController {

	@Autowired
	BlogService blogService;
	
	@Autowired
	BlogCategoryService blogCategoryService;

	@GetMapping("/blogsadmin")
	public String getBlogs(Model model) {
		List<Blog> blogs = blogService.getBlogs();
		model.addAttribute("items", blogs);

		return "blog/blogs";
	}

	@GetMapping("/add-blog")
	public String getBlog(Model model) {
		List<BlogCategory> categories=blogCategoryService.getBlogCategories();
		model.addAttribute("categories",categories);
		return "blog/add";
	}

	@PostMapping("/addblog")
	public RedirectView saveBlog(Blog blog, @RequestParam("photo") MultipartFile multipartFile) throws IOException, ParseException {

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		//System.out.println(fileName);
		blog.setPhotos(fileName);
		Date date=DateBlogUtil.toDate(blog.getDate(), "yyyy-mm-dd");
		blog.setDay(DateBlogUtil.toDayName(date.getDay()));
		blog.setMonth(DateBlogUtil.toMonthName(date.getMonth()));
		//blog.setMonth(fileName);
		Blog savedBlog = blogService.save(blog);
		//String uploadDir = "src/main/resources/static/photos/" + savedBlog.getId();
		String uploadDir = "src/main/resources/static/photos/";
		System.out.println(uploadDir);

		FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

		return new RedirectView("/blogsadmin", true);
	}
	
	@RequestMapping("/blog/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Blog blog = blogService.findById(id);
		model.addAttribute("item", blog);
		return "blog/view";
	}
	
	@RequestMapping("/editblog/{id}")
	public String findBlogById(@PathVariable("id") Long id, Model model) {
		Blog blog = blogService.findById(id);
		model.addAttribute("item", blog);
		return "blog/edit";
	}
}
