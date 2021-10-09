package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String RoomNo;
	String Floor;
	@ManyToOne
	@JoinColumn(name = "unit_id")
	RoomType RoomType;
	String Status;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(String roomNo, String floor, RoomType roomType, String status) {
		super();
		RoomNo = roomNo;
		Floor = floor;
		RoomType = roomType;
		Status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(String roomNo) {
		RoomNo = roomNo;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public RoomType getRoomType() {
		return RoomType;
	}

	public void setRoomType(RoomType roomType) {
		RoomType = roomType;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
}
