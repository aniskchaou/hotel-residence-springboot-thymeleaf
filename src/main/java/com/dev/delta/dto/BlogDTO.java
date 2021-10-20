package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.BlogRepository;

@Service
public class BlogDTO implements DTO {

	@Autowired
	BlogRepository blogRepository;
	
	@Override
	public void populate() {
		blog.setTitle("Lorem ipsum dolor sit amet");
		blog.setDate(new Date().toString());
		blog.setBody("Lorem ipsum dolor sit amet");
		blog.setUser("Admin");
		blogRepository.save(blog);

	}

}
