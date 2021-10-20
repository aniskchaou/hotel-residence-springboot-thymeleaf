package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LaundryOrder {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String customer;
	String laundryitem;
	String date;
	
	public LaundryOrder() {
		// TODO Auto-generated constructor stub
	}

	public LaundryOrder(String customer, String laundryitem, String date) {
		super();
		this.customer = customer;
		this.laundryitem = laundryitem;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getLaundryitem() {
		return laundryitem;
	}

	public void setLaundryitem(String laundryitem) {
		this.laundryitem = laundryitem;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
