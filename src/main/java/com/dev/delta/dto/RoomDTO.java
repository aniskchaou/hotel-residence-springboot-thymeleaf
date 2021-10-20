package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.RoomRepository;

@Service
public class RoomDTO implements DTO {

	@Autowired
	RoomRepository roomRepository;
	
	@Override
	public void populate() {
	  
		room.setFloor("12");
		room.setRoomNo("1023");
		room.setRoomType(roomType1);
		room.setStatus("Active");
		roomRepository.save(room);

	}

}
