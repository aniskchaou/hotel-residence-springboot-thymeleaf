package com.dev.delta.i18n.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dev.delta.entities.BlogCategory;
import com.dev.delta.entities.City;
import com.dev.delta.entities.Country;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.GuestType;
import com.dev.delta.entities.Room;

@Entity
public class BlogI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String titleI18n;
	String bodyI18n;
	String dateI18n;
	String userI18n;
     String photosI18n;
	String dayI18n;
	String monthI18n;
	String blogCategoryI18n;
	String langI18n;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitleI18n() {
		return titleI18n;
	}
	public void setTitleI18n(String titleI18n) {
		this.titleI18n = titleI18n;
	}
	public String getBodyI18n() {
		return bodyI18n;
	}
	public void setBodyI18n(String bodyI18n) {
		this.bodyI18n = bodyI18n;
	}
	public String getDateI18n() {
		return dateI18n;
	}
	public void setDateI18n(String dateI18n) {
		this.dateI18n = dateI18n;
	}
	public String getUserI18n() {
		return userI18n;
	}
	public void setUserI18n(String userI18n) {
		this.userI18n = userI18n;
	}
	public String getPhotosI18n() {
		return photosI18n;
	}
	public void setPhotosI18n(String photosI18n) {
		this.photosI18n = photosI18n;
	}
	public String getDayI18n() {
		return dayI18n;
	}
	public void setDayI18n(String dayI18n) {
		this.dayI18n = dayI18n;
	}
	public String getMonthI18n() {
		return monthI18n;
	}
	public void setMonthI18n(String monthI18n) {
		this.monthI18n = monthI18n;
	}
	public String getBlogCategoryI18n() {
		return blogCategoryI18n;
	}
	public void setBlogCategoryI18n(String blogCategoryI18n) {
		this.blogCategoryI18n = blogCategoryI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
	
}
