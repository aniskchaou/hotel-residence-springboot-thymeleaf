package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dev.delta.entities.FoodCategory;

@Entity
public class FoodI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  CategoryI18n;
	String ItemNameI18n;
	String PriceI18n;
	String DescriptionI18n;
	String StatusI18n;
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
	public String getCategoryI18n() {
		return CategoryI18n;
	}
	public void setCategoryI18n(String categoryI18n) {
		CategoryI18n = categoryI18n;
	}
	public String getItemNameI18n() {
		return ItemNameI18n;
	}
	public void setItemNameI18n(String itemNameI18n) {
		ItemNameI18n = itemNameI18n;
	}
	public String getPriceI18n() {
		return PriceI18n;
	}
	public void setPriceI18n(String priceI18n) {
		PriceI18n = priceI18n;
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
