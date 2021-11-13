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
		  
		
		roomI18n.setFloorI18n("Floor");
		roomI18n.setRoomNoI18n("Room No");
		roomI18n.setRoomTypeI18n("Room type");
		roomI18n.setStatusI18n("Status");
		roomI18n.setGetTitleI18n("Room");
		roomI18n.setCreateTitleI18n("Create");
		roomI18n.setEditTitleI18n("Edit");
		roomI18n.setGetAllTitleI18n("Rooms");
		roomI18n.setLangI18n("EN");
		roomI18nRepository.save(roomI18n);
		
		roomI18n2.setFloorI18n("Gebäudeplan");
		roomI18n2.setRoomNoI18n("Zimmernummer");
		roomI18n2.setRoomTypeI18n("Zimmertyp");
		roomI18n2.setStatusI18n("Status");
		roomI18n2.setGetTitleI18n("Zimmer");
		roomI18n2.setCreateTitleI18n("Erstellen");
		roomI18n2.setEditTitleI18n("Bearbeiten");
		roomI18n2.setGetAllTitleI18n("Räume");
		roomI18n2.setLangI18n("DE");
		roomI18nRepository.save(roomI18n2);

	}

}
