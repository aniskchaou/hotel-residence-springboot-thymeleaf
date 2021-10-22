package com.dev.delta.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.dev.delta.entities.Blog;
import com.dev.delta.services.BlogService;
import com.dev.delta.util.FileUploadUtil;

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

	@GetMapping("/add-blog")
	public String getBlog(Model model) {
		return "blog/add";
	}

	@PostMapping("/addblog")
	public RedirectView saveBlog(Blog blog, @RequestParam("photo") MultipartFile multipartFile) throws IOException {

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		System.out.println(fileName);
		blog.setPhotos(fileName);
		Blog savedBlog = blogService.save(blog);
		//String uploadDir = "src/main/resources/static/photos/" + savedBlog.getId();
		String uploadDir = "src/main/resources/static/photos/";
		System.out.println(uploadDir);

		FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

		return new RedirectView("/blogsadmin", true);
	}
}
