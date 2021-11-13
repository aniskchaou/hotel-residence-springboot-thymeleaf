package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.InformationHotelRepository;
import com.dev.delta.i18n.repositories.InformationI18nRepository;
import com.dev.delta.repositories.InformationRepository;

@Service
public class InformationHotelDTO implements DTO {

	@Autowired
	InformationRepository  informationService;
	
	@Autowired
	InformationHotelRepository  informationHotelRepository;
	
	@Autowired
	InformationI18nRepository  informationI18nRepository;
	
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
		informationHotel.setLangbackoffice("DE");
		informationService.save(informationHotel);
		
		
		informationHotelI18n.setAdressI18n("Address");
		informationHotelI18n.setDescriptionI18n("Description");
		informationHotelI18n.setEmailI18n("Email");
		informationHotelI18n.setNameI18n("Name");
		informationHotelI18n.setTelephoneI18n("Phone");
		informationHotelI18n.setFacebookI18n("Facebook");
		informationHotelI18n.setTwitterI18n("Twitter");
		informationHotelI18n.setInstagramI18n("Instagram");
		informationHotelI18n.setLangI18n("EN");
		informationHotelI18n.setLangbackoficeI18n("EN");
		informationHotelI18n.setLang("EN");
		informationHotelI18n.setGetAllTitleI18n("Cities");
		informationHotelI18n.setCreateTitleI18n("Create new City");
		informationHotelI18n.setEditTitleI18n("Edit City");
		informationHotelI18n.setGetTitleI18n("City");
		informationI18nRepository.save(informationHotelI18n);
		
		
		informationHotelI18n2.setAdressI18n("Address");
		informationHotelI18n2.setDescriptionI18n("Description");
		informationHotelI18n2.setEmailI18n("Email");
		informationHotelI18n2.setNameI18n("Name");
		informationHotelI18n2.setTelephoneI18n("Phone");
		informationHotelI18n2.setFacebookI18n("Facebook");
		informationHotelI18n2.setTwitterI18n("Twitter");
		informationHotelI18n2.setInstagramI18n("Instagram");
		informationHotelI18n2.setLangI18n("DE");
		informationHotelI18n2.setLangbackoficeI18n("DE");
		informationHotelI18n2.setLang("DE");
		informationHotelI18n2.setGetAllTitleI18n("Cities");
		informationHotelI18n2.setCreateTitleI18n("Create new City");
		informationHotelI18n2.setEditTitleI18n("Edit City");
		informationHotelI18n2.setGetTitleI18n("City");
		informationI18nRepository.save(informationHotelI18n2);
		
		
		
		
		
		
	}

}
