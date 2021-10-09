package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "category_id")
	ExpenseCategory Category ;
	String Title;
	String Amount;
	String Date;
	String Remark;
	
	public Expense() {
		// TODO Auto-generated constructor stub
	}

	public Expense(ExpenseCategory category, String title, String amount, String date, String remark) {
		super();
		Category = category;
		Title = title;
		Amount = amount;
		Date = date;
		Remark = remark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ExpenseCategory getCategory() {
		return Category;
	}

	public void setCategory(ExpenseCategory category) {
		Category = category;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}
	
	
}
