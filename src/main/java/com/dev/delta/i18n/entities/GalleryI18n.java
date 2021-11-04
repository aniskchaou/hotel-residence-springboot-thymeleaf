package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String titleI18n;
	String subTitleI18n;
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
	public String getSubTitleI18n() {
		return subTitleI18n;
	}
	public void setSubTitleI18n(String subTitleI18n) {
		this.subTitleI18n = subTitleI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
