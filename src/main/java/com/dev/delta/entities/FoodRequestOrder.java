package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FoodRequestOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String customer;
	String NoofPersons;
	@ManyToOne
	@JoinColumn(name = "food_id")
	Food FoodItem;
	String status;
	
public FoodRequestOrder() {
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNoofPersons() {
	return NoofPersons;
}

public void setNoofPersons(String noofPersons) {
	NoofPersons = noofPersons;
}

public Food getFoodItem() {
	return FoodItem;
}

public void setFoodItem(Food foodItem) {
	FoodItem = foodItem;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}


}
