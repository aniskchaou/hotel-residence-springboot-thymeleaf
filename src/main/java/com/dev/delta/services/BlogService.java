package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Blog;
import com.dev.delta.repositories.BlogRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;

	/**
	 * getFoods
	 * 
	 * @return
	 */
	public List<Blog> getBlogs() {
		return blogRepository.findAll();
	}
}
