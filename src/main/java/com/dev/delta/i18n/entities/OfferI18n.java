package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OfferI18n {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nameI18n;
	String descriptionI18n;
	String imageI18n;
	String titleI18n;
	String langI18n;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameI18n() {
		return nameI18n;
	}
	public void setNameI18n(String nameI18n) {
		this.nameI18n = nameI18n;
	}
	public String getDescriptionI18n() {
		return descriptionI18n;
	}
	public void setDescriptionI18n(String descriptionI18n) {
		this.descriptionI18n = descriptionI18n;
	}
	public String getImageI18n() {
		return imageI18n;
	}
	public void setImageI18n(String imageI18n) {
		this.imageI18n = imageI18n;
	}
	public String getTitleI18n() {
		return titleI18n;
	}
	public void setTitleI18n(String titleI18n) {
		this.titleI18n = titleI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
