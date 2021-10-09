package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExtraBed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer customer;
	@ManyToOne
	@JoinColumn(name = "room_type_id")
	RoomType roomType;
	@ManyToOne
	@JoinColumn(name = "room_id")
	Room room;
	String ExtraBed;
	String BedNo;
	String Comment;
	
	public ExtraBed() {
		// TODO Auto-generated constructor stub
	}

	public ExtraBed(Customer customer, RoomType roomType, Room room, String extraBed, String bedNo, String comment) {
		super();
		this.customer = customer;
		this.roomType = roomType;
		this.room = room;
		ExtraBed = extraBed;
		BedNo = bedNo;
		Comment = comment;
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

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getExtraBed() {
		return ExtraBed;
	}

	public void setExtraBed(String extraBed) {
		ExtraBed = extraBed;
	}

	public String getBedNo() {
		return BedNo;
	}

	public void setBedNo(String bedNo) {
		BedNo = bedNo;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}
	
	
}
