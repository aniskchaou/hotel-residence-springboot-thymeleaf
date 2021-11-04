package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HouseKeepingRequestOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "room_id")
	Room Room;
	String status;
	String date;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer customer;
	
	public HouseKeepingRequestOrder() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public Customer getCustomer() {
		return customer;
	}





	public void setCustomer(Customer customer) {
		this.customer = customer;
	}





	public String getDate() {
		return date;
	}





	public void setDate(String date) {
		this.date = date;
	}











	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Room getRoom() {
		return Room;
	}

	public void setRoom(Room room) {
		Room = room;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
