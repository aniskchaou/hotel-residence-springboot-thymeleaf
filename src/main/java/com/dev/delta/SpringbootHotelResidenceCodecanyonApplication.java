package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.delta.dto.AmenityDTO;
import com.dev.delta.dto.UserDTO;

@SpringBootApplication
public class SpringbootHotelResidenceCodecanyonApplication implements CommandLineRunner{

	@Autowired
	UserDTO userDTO;
	
	@Autowired
	AmenityDTO amenityDTO;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHotelResidenceCodecanyonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userDTO.populate();
		amenityDTO.populate();
	}

}
