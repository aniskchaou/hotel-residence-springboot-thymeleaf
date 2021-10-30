package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExtraBedRequestOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String customer;
	@ManyToOne
	@JoinColumn(name = "room_id")
	Room room;
	String ExtraBed;
	String Comment;
	String status;
	
	public ExtraBedRequestOrder() {
		// TODO Auto-generated constructor stub
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}
	
	
}
