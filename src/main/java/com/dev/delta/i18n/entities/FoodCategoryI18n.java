package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodCategoryI18n {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String NameI18n;
	String DescriptionI18n;
	String StatusI18n;
	String langI18n;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameI18n() {
		return NameI18n;
	}
	public void setNameI18n(String nameI18n) {
		NameI18n = nameI18n;
	}
	public String getDescriptionI18n() {
		return DescriptionI18n;
	}
	public void setDescriptionI18n(String descriptionI18n) {
		DescriptionI18n = descriptionI18n;
	}
	public String getStatusI18n() {
		return StatusI18n;
	}
	public void setStatusI18n(String statusI18n) {
		StatusI18n = statusI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
