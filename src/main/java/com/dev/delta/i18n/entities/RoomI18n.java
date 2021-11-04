package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dev.delta.entities.RoomType;

@Entity
public class RoomI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String RoomNoI18n;
	String FloorI18n;
	String RoomTypeI18n;
	String StatusI18n;
	String bookedStatusI18n;
	String langI18n;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoomNoI18n() {
		return RoomNoI18n;
	}
	public void setRoomNoI18n(String roomNoI18n) {
		RoomNoI18n = roomNoI18n;
	}
	public String getFloorI18n() {
		return FloorI18n;
	}
	public void setFloorI18n(String floorI18n) {
		FloorI18n = floorI18n;
	}
	public String getRoomTypeI18n() {
		return RoomTypeI18n;
	}
	public void setRoomTypeI18n(String roomTypeI18n) {
		RoomTypeI18n = roomTypeI18n;
	}
	public String getStatusI18n() {
		return StatusI18n;
	}
	public void setStatusI18n(String statusI18n) {
		StatusI18n = statusI18n;
	}
	public String getBookedStatusI18n() {
		return bookedStatusI18n;
	}
	public void setBookedStatusI18n(String bookedStatusI18n) {
		this.bookedStatusI18n = bookedStatusI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
