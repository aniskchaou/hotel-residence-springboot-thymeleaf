package com.dev.delta.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.BlogI18nRepository;
import com.dev.delta.repositories.BlogRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.util.DateBlogUtil;

@Service
public class BlogDTO implements DTO {

	@Autowired
	BlogRepository blogRepository;
	
	@Autowired
	NotificationRepository  notificationRepository;
	
	@Autowired
	BlogI18nRepository blogI18nRepository;

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
		
		
		
		blogI18n.setTitleI18n("Title");
		blogI18n.setDateI18n("Date");
		blogI18n.setBodyI18n("Body");
		blogI18n.setUserI18n("User");
		blogI18n.setPhotosI18n("Photo");
		blogI18n.setDayI18n("Day");
		blogI18n.setMonthI18n("Month");
		blogI18n.setBlogCategoryI18n("Blog Category");
		blogI18n.setLangI18n("EN");
		blogI18n.setGetTitleI18n("City");
		blogI18n.setCreateTitleI18n("Create new City");
		blogI18n.setEditTitleI18n("Edit City");
		blogI18n.setGetAllTitleI18n("Cities");
		blogI18nRepository.save(blogI18n);
		
		
		blogI18n2.setTitleI18n("Titel");
		blogI18n2.setDateI18n("Datum");
		blogI18n2.setBodyI18n("Body");
		blogI18n2.setUserI18n("Benutzer");
		blogI18n2.setPhotosI18n("Bild");
		blogI18n2.setDayI18n("Tag");
		blogI18n2.setMonthI18n("Monate");
		blogI18n2.setBlogCategoryI18n("BlogKategorie");
		blogI18n2.setLangI18n("DE");
		blogI18n2.setGetTitleI18n("Stadt");
		blogI18n2.setCreateTitleI18n("Erstellen");
		blogI18n2.setEditTitleI18n("Bearbeiten");
		blogI18n2.setGetAllTitleI18n("Städte");
		blogI18nRepository.save(blogI18n2);

	}

}
