package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.OfferService;

@Service
public class OfferDTO implements DTO {

	@Autowired
	 OfferService offerService;
	@Override
	public void populate() {
		offer.setDescription("Luxaries condition\r\n"
				+ "3 Adults & 2 Children size\r\n"
				+ "Sea view side");
		offer.setImage("/photos/offer/1.png");
		offer.setName("offer 1");
		offer.setTitle("Up to 35% savings on Club\r\n"
				+ "rooms and Suites");
		
		
		offer2.setDescription("Luxaries condition\r\n"
				+ "3 Adults & 2 Children size\r\n"
				+ "Sea view side");
		offer2.setImage("/photos/offer/2.png");
		offer2.setName("offer 1");
		offer2.setTitle("Up to 35% savings on Club\r\n"
				+ "rooms and Suites");
		
		
		offer3.setDescription("Luxaries condition\r\n"
				+ "3 Adults & 2 Children size\r\n"
				+ "Sea view side");
		offer3.setImage("/photos/offer/3.png");
		offer3.setName("offer 1");
		offer3.setTitle("Up to 35% savings on Club\r\n"
				+ "rooms and Suites");
		offerService.save(offer);
		offerService.save(offer2);
		offerService.save(offer3);

	}

}
