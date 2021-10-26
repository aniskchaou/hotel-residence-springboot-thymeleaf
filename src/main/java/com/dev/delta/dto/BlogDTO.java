package com.dev.delta.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.BlogRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.util.DateBlogUtil;

@Service
public class BlogDTO implements DTO {

	@Autowired
	BlogRepository blogRepository;
	
	@Autowired
	NotificationRepository  notificationRepository;

	@Override
	public void populate() {
		

		blog.setTitle("Google inks pact for new 35-storey office");
		blog.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog.setBody("	That dominion stars lights dominion divide years for fourth have don\\'t stars\r\n"
				+ "		is that he earth it first without heaven in place seed it second morning saying");
		blog.setUser("admin");
		blog.setPhotos("blog/single_blog_1.png");
		blog.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog.setBlogCategory(blogCategory);

		blog2.setTitle("Google inks pact for new 35-storey office");
		blog2.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog2.setBody("	That dominion stars lights dominion divide years for fourth have don\\'t stars\r\n"
				+ "		is that he earth it first without heaven in place seed it second morning saying");
		blog2.setUser("Admin");
		blog2.setPhotos("blog/single_blog_2.png");
		blog2.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog2.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog2.setBlogCategory(blogCategory);

		blog3.setTitle("Google inks pact for new 35-storey office");
		blog3.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog3.setBody("	That dominion stars lights dominion divide years for fourth have don\\'t stars\r\n"
				+ "		is that he earth it first without heaven in place seed it second morning saying");
		blog3.setUser("Admin");
		blog3.setPhotos("blog/single_blog_3.png");
		blog3.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog3.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog3.setBlogCategory(blogCategory);

		blog4.setTitle("Google inks pact for new 35-storey office");
		blog4.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog4.setBody("	That dominion stars lights dominion divide years for fourth have don\\'t stars\r\n"
				+ "		is that he earth it first without heaven in place seed it second morning saying");
		blog4.setUser("Admin");
		blog4.setPhotos("blog/single_blog_4.png");
		blog4.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog4.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog4.setBlogCategory(blogCategory);

		blogRepository.save(blog);
		blogRepository.save(blog2);
		blogRepository.save(blog3);
		blogRepository.save(blog4);
		
		notification.setName(" Google inks pact for new 35-storey office is created");
		notification.setDate(new Date().toString());
		notificationRepository.save(notification);
		
		

	}

}
