package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class LaundryItemI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String quantity;
	String comment;
	String langI18n;
	String getAllTitleI18n;
	String getTitleI18n;
	String editTitleI18n;
	String createTitleI18n;
	
	
	
	public String getGetAllTitleI18n() {
		return getAllTitleI18n;
	}
	public void setGetAllTitleI18n(String getAllTitleI18n) {
		this.getAllTitleI18n = getAllTitleI18n;
	}
	public String getGetTitleI18n() {
		return getTitleI18n;
	}
	public void setGetTitleI18n(String getTitleI18n) {
		this.getTitleI18n = getTitleI18n;
	}
	public String getEditTitleI18n() {
		return editTitleI18n;
	}
	public void setEditTitleI18n(String editTitleI18n) {
		this.editTitleI18n = editTitleI18n;
	}
	public String getCreateTitleI18n() {
		return createTitleI18n;
	}
	public void setCreateTitleI18n(String createTitleI18n) {
		this.createTitleI18n = createTitleI18n;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
