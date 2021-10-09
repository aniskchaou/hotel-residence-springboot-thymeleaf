package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer customer;
	String NoofPersons;
	@ManyToOne
	@JoinColumn(name = "waiter_id")
	Employee WaiterName;
	@ManyToOne
	@JoinColumn(name = "food_id")
	Food FoodItem;
	
	public FoodOrder() {
		// TODO Auto-generated constructor stub
	}

	public FoodOrder(Customer customer, String noofPersons, Employee waiterName, Food foodItem) {
		super();
		this.customer = customer;
		NoofPersons = noofPersons;
		WaiterName = waiterName;
		FoodItem = foodItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getNoofPersons() {
		return NoofPersons;
	}

	public void setNoofPersons(String noofPersons) {
		NoofPersons = noofPersons;
	}

	public Employee getWaiterName() {
		return WaiterName;
	}

	public void setWaiterName(Employee waiterName) {
		WaiterName = waiterName;
	}

	public Food getFoodItem() {
		return FoodItem;
	}

	public void setFoodItem(Food foodItem) {
		FoodItem = foodItem;
	}
	
	

}
