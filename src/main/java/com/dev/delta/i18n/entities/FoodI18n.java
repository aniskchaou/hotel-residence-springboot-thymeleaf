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
