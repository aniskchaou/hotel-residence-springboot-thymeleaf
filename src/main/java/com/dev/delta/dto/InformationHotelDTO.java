package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.InformationRepository;

@Service
public class InformationHotelDTO implements DTO {

	@Autowired
	InformationRepository  informationService;
	
	@Override
	public void populate() {
		informationHotel.setAdress("\r\n"
				+ "17 Route de Klingenthal 67530 Ottrott, France");
		informationHotel.setDescription("Suscipit libero pretium nullam potenti. Interdum, blandit phasellus consectetuer dolor ornare dapibus enim ut tincidunt rhoncus tellus sollicitudin pede nam maecenas, dolor sem. Neque sollicitudin enim. Dapibus lorem feugiat facilisi faucibus et. Rhoncus.");
		informationHotel.setEmail("nfo@6717hotelspa.com");
		informationHotel.setName("Hotel Residence");
		informationHotel.setTelephone("13 44 33 4 555  55");
		informationHotel.setFacebook("https://www.facebook.com");
		informationHotel.setTwitter("https://www.twitter.com");
		informationHotel.setInstagram("https://www.instagram.com");
		informationHotel.setLang("EN");
		informationService.save(informationHotel);
	}

}
