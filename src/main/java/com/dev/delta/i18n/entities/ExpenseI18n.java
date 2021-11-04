package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dev.delta.entities.ExpenseCategory;

@Entity
public class ExpenseI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String CategoryI18n ;
	String nameI18n;
	String AmountI18n;
	String DateI18n;
	String RemarkI18n;
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
	public String getNameI18n() {
		return nameI18n;
	}
	public void setNameI18n(String nameI18n) {
		this.nameI18n = nameI18n;
	}
	public String getAmountI18n() {
		return AmountI18n;
	}
	public void setAmountI18n(String amountI18n) {
		AmountI18n = amountI18n;
	}
	public String getDateI18n() {
		return DateI18n;
	}
	public void setDateI18n(String dateI18n) {
		DateI18n = dateI18n;
	}
	public String getRemarkI18n() {
		return RemarkI18n;
	}
	public void setRemarkI18n(String remarkI18n) {
		RemarkI18n = remarkI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
