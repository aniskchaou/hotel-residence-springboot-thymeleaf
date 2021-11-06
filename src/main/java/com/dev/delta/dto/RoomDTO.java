package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.RoomI18nRepository;
import com.dev.delta.repositories.RoomRepository;

@Service
public class RoomDTO implements DTO {

	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	RoomI18nRepository  roomI18nRepository;
	
	@Override
	public void populate() {
	  
		room.setFloor("12");
		room.setRoomNo("1023");
		room.setRoomType(roomType1);
		room.setStatus("Active");
		roomRepository.save(room);
		  
		
		roomI18n.setFloorI18n("12");
		roomI18n.setRoomNoI18n("1023");
		roomI18n.setRoomTypeI18n("");
		roomI18n.setStatusI18n("Active");
		roomI18n.setGetTitleI18n("City");
		roomI18n.setCreateTitleI18n("Create new City");
		roomI18n.setEditTitleI18n("Edit City");
		roomI18n.setGetAllTitleI18n("Cities");
		roomI18nRepository.save(roomI18n);
		
		roomI18n2.setFloorI18n("12");
		roomI18n2.setRoomNoI18n("1023");
		roomI18n2.setRoomTypeI18n("");
		roomI18n2.setStatusI18n("Active");
		roomI18n2.setGetTitleI18n("City");
		roomI18n2.setCreateTitleI18n("Create new City");
		roomI18n2.setEditTitleI18n("Edit City");
		roomI18n2.setGetAllTitleI18n("Cities");
		roomI18nRepository.save(roomI18n2);

	}

}
