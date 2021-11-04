package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShiftI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String typeI18n;
	String startI18n;
	String endI18n;
	String langI18n;
	
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeI18n() {
		return typeI18n;
	}
	public void setTypeI18n(String typeI18n) {
		this.typeI18n = typeI18n;
	}
	public String getStartI18n() {
		return startI18n;
	}
	public void setStartI18n(String startI18n) {
		this.startI18n = startI18n;
	}
	public String getEndI18n() {
		return endI18n;
	}
	public void setEndI18n(String endI18n) {
		this.endI18n = endI18n;
	}
	
	
}
