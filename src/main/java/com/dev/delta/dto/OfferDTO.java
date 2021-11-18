package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.OfferI18nRepository;
import com.dev.delta.services.OfferService;

@Service
public class OfferDTO implements DTO {

	@Autowired
	 OfferService offerService;
	
	@Autowired
	OfferI18nRepository  offerI18nRepository;
	
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
		offer2.setName("offer 2");
		offer2.setTitle("Up to 35% savings on Club\r\n"
				+ "rooms and Suites");
		
		
		offer3.setDescription("Luxaries condition\r\n"
				+ "3 Adults & 2 Children size\r\n"
				+ "Sea view side");
		offer3.setImage("/photos/offer/3.png");
		offer3.setName("offer 3");
		offer3.setTitle("Up to 35% savings on Club\r\n"
				+ "rooms and Suites");
		offerService.save(offer);
		offerService.save(offer2);
		offerService.save(offer3);
		
		offerI18n.setDescriptionI18n("Description");
		offerI18n.setImageI18n("Image");
		offerI18n.setNameI18n("Name");
		offerI18n.setTitleI18n("Title");
		offerI18n.setGetTitleI18n("City");
		offerI18n.setCreateTitleI18n("Create new City");
		offerI18n.setEditTitleI18n("Edit City");
		offerI18n.setGetAllTitleI18n("Cities");
		offerI18n.setLangI18n("EN");
		offerI18nRepository.save(offerI18n);
		
		
		offerI18n2.setDescriptionI18n("Description");
		offerI18n2.setImageI18n("Image");
		offerI18n2.setNameI18n("Name");
		offerI18n2.setTitleI18n("Title");
		offerI18n2.setGetTitleI18n("City");
		offerI18n2.setCreateTitleI18n("Create new City");
		offerI18n2.setEditTitleI18n("Edit City");
		offerI18n2.setGetAllTitleI18n("Cities");
		offerI18n2.setLangI18n("DE");
		offerI18nRepository.save(offerI18n2);
		
		offerI18n3.setDescriptionI18n ("Descripción");
		offerI18n3.setImageI18n ("Imagen");
		offerI18n3.setNameI18n ("Nombre");
		offerI18n3.setTitleI18n ("Título");
		offerI18n3.setGetTitleI18n ("Ciudad");
		offerI18n3.setCreateTitleI18n ("Crear nueva ciudad");
		offerI18n3.setEditTitleI18n ("Editar ciudad");
		offerI18n3.setGetAllTitleI18n ("Ciudades");
		offerI18n3.setLangI18n ("ES");
		offerI18nRepository.save (offerI18n3);
		
		offerI18n4.setDescriptionI18n("Description");
		offerI18n4.setImageI18n("Image");
		offerI18n4.setNameI18n("Nom");
		offerI18n4.setTitleI18n("Titre");
		offerI18n4.setGetTitleI18n("Ville");
		offerI18n4.setCreateTitleI18n("Créer une nouvelle ville");
		offerI18n4.setEditTitleI18n("Modifier la ville");
		offerI18n4.setGetAllTitleI18n("Villes");
		offerI18n4.setLangI18n("FR");
		offerI18nRepository.save(offerI18n4);
		
		offerI18n5.setDescriptionI18n ("الوصف") ;
		offerI18n5.setImageI18n ("صورة") ;
		offerI18n5.setNameI18n ("الاسم") ;
		offerI18n5.setTitleI18n ("العنوان") ;
		offerI18n5.setGetTitleI18n ("المدينة") ;
		offerI18n5.setCreateTitleI18n ("إنشاء مدينة جديدة") ;
		offerI18n5.setEditTitleI18n ("تحرير المدينة") ;
		offerI18n5.setGetAllTitleI18n ("المدن") ;
		offerI18n5.setLangI18n ("AR") ;
		offerI18nRepository.save (offerI18n5) ;
		
		

	}

}
