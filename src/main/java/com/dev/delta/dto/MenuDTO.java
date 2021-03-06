package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.UIMenuI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;

@Service
public class MenuDTO implements DTO {

	@Autowired
	UIMenuI18nRepository uiMenuI18nRepository ;
	
	@Override
	public void populate() {
		menuI18n.setAmenities("Amenities");
		menuI18n.setOrders("Orders");
		menuI18n.setBeds("Beds");
		menuI18n.setBlogcategories("Blog Categories");
		menuI18n.setBlogs("Blogs");
		menuI18n.setChekins("Check in");
		menuI18n.setCities("Cities");
		menuI18n.setCms("CMS");
		menuI18n.setChekins("Checkins");
		menuI18n.setCountries("Countries");
		menuI18n.setCustomers("Customers");
		menuI18n.setDashboard("Dashboard");
		menuI18n.setDocumentation("Documentation");
		menuI18n.setExpenses("Expenses");
		menuI18n.setExpensescategories("Expense Categories");
		menuI18n.setExtrabedorder("Extra Beds Orders");
		menuI18n.setExtrabedrequest("Extra Beds RQ");
		menuI18n.setFacilities("Facilities");
		menuI18n.setFoodorder("Food Orders");
		menuI18n.setFoodrequest("Food RQ");
		menuI18n.setGalleries("Galleries");
		menuI18n.setGuests("Guests");
		menuI18n.setGuesttypes("Guest Types");
		menuI18n.setHousekeepingorder("House Keeping Or");
		menuI18n.setHousekeepingrequest("House Keeping RQ");
		menuI18n.setInformations("Hotel infos");
		menuI18n.setLaundries("Laundries");
		menuI18n.setLaundryitems("Laundry Items");
		menuI18n.setLaundryorder("Landry Orders");
		menuI18n.setLocations("Locations");
		menuI18n.setLaundryrequest("Laundry RQ");
		menuI18n.setMessages("Messages");
		menuI18n.setOffers("Offers");
		menuI18n.setPaymentmethods("Payment Methods");
		menuI18n.setPayments("Payments");
		menuI18n.setRooms("Rooms");
		menuI18n.setRoomsTypes("Room Types");
		menuI18n.setSubrcribers("Subscribers");
		menuI18n.setUsers("Users");
		menuI18n.setWebsite("Website");
		menuI18n.setRequests("Requests");
		menuI18n.setLang("EN");
		menuI18n.setFoods("Foods");
		menuI18n.setFoodcategories("Food Categories");
		menuI18n.setEmployees("Employees");
		menuI18n.setDepartements("Departements");
		menuI18n.setDesignations("Designations");
		menuI18n.setShifts("Shifts");
		menuI18n.setHousekeeping("House Keeping");
		menuI18n.setHousekeepingitems("House Keeping Items");
		menuI18n.setSubrcribers("Subscribers");
		menuI18n.setSettings("Settings");
		menuI18n.setProfile("Profile");
		menuI18n.setLogout("Log out");
		uiMenuI18nRepository.save(menuI18n);
		
		
		menuI18n2.setProfile("Profil");
		menuI18n2.setLogout("Abmelden");
		menuI18n2.setEmployees("Mitarbeiter");
		menuI18n2.setFoodcategories("Lebensmittelkategorien");
		menuI18n2.setAmenities("Ausstattung");
		menuI18n2.setBeds("Beds");
		menuI18n2.setBlogcategories("Blog-Kategorien");
		menuI18n2.setBlogs("Blogs");
		menuI18n2.setOrders("Auftr??ge");
		menuI18n2.setRequests("Anfragen");
		menuI18n2.setChekins("Einchecken");
		menuI18n2.setCities("St??dte");
		menuI18n2.setCms("CMS");
		menuI18n2.setFoods("Lebensmittel");
		menuI18n2.setCountries("L??nder");
		menuI18n2.setCustomers("Kunden");
		menuI18n2.setDashboard("Armaturenbrett");
		menuI18n2.setDocumentation("Dokumentation");
		menuI18n2.setExpenses("Kosten");
		menuI18n2.setExpensescategories("Ausgabenkategorien");
		menuI18n2.setExtrabedorder("ExtraBetten ");
		menuI18n2.setExtrabedrequest("ExtraBetten ");
		menuI18n2.setFacilities("Anlagen");
		menuI18n2.setFoodorder("Essensbestellungen");
		menuI18n2.setFoodrequest("Essen");
		menuI18n2.setGalleries("Galerien");
		menuI18n2.setGuests("G??ste");
		menuI18n2.setGuesttypes("Gasttypen");
		menuI18n2.setHousekeepingorder("Zimmerreinigung ");
		menuI18n2.setHousekeepingrequest("Zimmerreinigung ");
		menuI18n2.setInformations("Hotelinformationen");
		menuI18n2.setLaundries("W??schereien");
		menuI18n2.setLaundryitems("W??scheartikel");
		menuI18n2.setLaundryorder("Landry-Bestellungen");
		menuI18n2.setLocations("Standorte");
		menuI18n2.setLaundryrequest("W??schereien");
		menuI18n2.setMessages("Nachrichten");
		menuI18n2.setOffers("Angebote");
		menuI18n2.setPaymentmethods("Zahlungsmethoden");
		menuI18n2.setPayments("Zahlungen");
		menuI18n2.setRooms("R??ume");
		menuI18n2.setRoomsTypes("Zimmertypen");
		menuI18n2.setSubrcribers("Abonnenten");
		menuI18n2.setUsers("Benutzer");
		menuI18n2.setWebsite("Website");
		menuI18n2.setLang("DE");
		menuI18n2.setFoods("Lebensmittel");
		menuI18n2.setFoodcategories("Lebensmittelkategorien");
		menuI18n2.setEmployees("Mitarbeiter");
		menuI18n2.setDepartements("Abteilungen");
		menuI18n2.setDesignations("Bezeichnungen");
		menuI18n2.setShifts("Verschiebungen");
		menuI18n2.setHousekeeping("Zimmerreinigung");
		menuI18n2.setHousekeepingitems("Haushaltsartikel");
		menuI18n2.setSubrcribers("Abonnenten");
		menuI18n2.setSettings("Einstellungen");
		
		uiMenuI18nRepository.save(menuI18n2);
		
		
		menuI18n3.setAmenities ("??????????????") ;
		menuI18n3.setOrders ("??????????????") ;
		menuI18n3.setBeds ("????????????") ;
		menuI18n3.setBlogcategories ("???????? ??????????????") ;
		menuI18n3.setBlogs ("????????????????") ;
		menuI18n3.setChekins ("?????????? ????????????") ;
		menuI18n3.setCities ("??????????") ;
		menuI18n3.setCms ("CMS") ;
		menuI18n3.setChekins ("?????????????? ????????????") ;
		menuI18n3.setCountries ("??????????????") ;
		menuI18n3.setCustomers ("??????????????") ;
		menuI18n3.setDashboard ("???????? ??????????????") ;
		menuI18n3.setDocumentation ("??????????????") ;
		menuI18n3.setExpenses ("????????????????") ;
		menuI18n3.setExpensescategories ("???????? ????????????????") ;
		menuI18n3.setExtrabedorder ("?????????? ???????????? ????????????????") ;
		menuI18n3.setExtrabedrequest ("???????? ?????????? RQ") ;
		menuI18n3.setFacilities ("??????????????") ;
		menuI18n3.setFoodorder ("?????????? ????????????") ;
		menuI18n3.setFoodrequest ("Food RQ") ;
		menuI18n3.setGalleries ("??????????????") ;
		menuI18n3.setGuests ("????????????") ;
		menuI18n3.setGuesttypes ("?????????? ??????????") ;
		menuI18n3.setHousekeepingorder ("?????????????? ?????????????? ????") ;
		menuI18n3.setHousekeepingrequest ("House Keeping RQ") ;
		menuI18n3.setInformations ("?????????????? ????????????") ;
		menuI18n3.setLaundries ("??????????") ;
		menuI18n3.setLaundryitems ("???????? ????????????") ;
		menuI18n3.setLaundryorder ("?????????? ??????????????") ;
		menuI18n3.setLocations ("??????????????") ;
		menuI18n3.setLaundryrequest ("Laundry RQ") ;
		menuI18n3.setMessages ("??????????????") ;
		menuI18n3.setOffers ("????????????") ;
		menuI18n3.setPaymentmethods ("?????? ??????????") ;
		menuI18n3.setPayments ("??????????????????") ;
		menuI18n3.setRooms ("??????????") ;
		menuI18n3.setRoomsTypes ("?????????? ??????????") ;
		menuI18n3.setSubrcribers ("??????????????????") ;
		menuI18n3.setUsers("????????????????????") ;
		menuI18n3.setWebsite ("???????? ??????????") ;
		menuI18n3.setRequests ("??????????????") ;
		menuI18n3.setLang ("AR") ;
		menuI18n3.setFoods ("??????????????") ;
		menuI18n3.setFoodcategories ("???????? ??????????????") ;
		menuI18n3.setEmployees ("????????????????") ;
		menuI18n3.setDepartements ("??????????????") ;
		menuI18n3.setDesignations ("??????????????????") ;
		menuI18n3.setShifts ("??????????????????") ;
		menuI18n3.setHousekeeping ("?????????????? ??????????????") ;
		menuI18n3.setHousekeepingitems ("?????????? ?????????????? ??????????????") ;
		menuI18n3.setSubrcribers ("??????????????????") ;
		menuI18n3.setSettings ("??????????????????") ;
		menuI18n3.setProfile ("?????????? ????????????") ;
		menuI18n3.setLogout ("?????????? ????????????") ;
		uiMenuI18nRepository.save (menuI18n3) ;

		menuI18n.setAmenities("Am??nagements");
		menuI18n.setOrders("Commandes");
		menuI18n.setBeds("Lits");
		menuI18n.setBlogcategories("Cat??gories de blog");
		menuI18n4.setBlogs("Blogs");
		menuI18n4.setChekins("Enregistrement");
		menuI18n4.setCities("Villes");
		menuI18n4.setCms("CMS");
		menuI18n4.setChekins("Enregistrements");
		menuI18n4.setCountries("Pays");
		menuI18n4.setCustomers("Clients");
		menuI18n4.setDashboard("Tableau de bord");
		menuI18n4.setDocumentation("Documentation");
		menuI18n4.setExpenses("D??penses");
		menuI18n4.setExpensescategories("Cat??gories de d??penses");
		menuI18n4.setExtrabedorder("Commandes de lits suppl??mentaires");
		menuI18n4.setExtrabedrequest("Lits suppl??mentaires RQ");
		menuI18n4.setFacilities("Installations");
		menuI18n4.setFoodorder("Commandes alimentaires");
		menuI18n4.setFoodrequest("Nourriture RQ");
		menuI18n4.setGalleries("Galeries");
		menuI18n4.setGuests("Invit??s");
		menuI18n4.setGuesttypes("Types d'invit??s");
		menuI18n4.setHousekeepingorder("Maison Ou");
		menuI18n4.setHousekeepingrequest("House Keeping RQ");
		menuI18n4.setInformations("Infos h??tel");
		menuI18n4.setLaundries("Laundries");
		menuI18n4.setLaundryitems("Articles de blanchisserie");
		menuI18n4.setLaundryorder("Commandes Landry");
		menuI18n4.setLocations("Emplacements");
		menuI18n4.setLaundryrequest("Laundry RQ");
		menuI18n4.setMessages("Messages");
		menuI18n4.setOffers("Offres");
		menuI18n4.setPaymentmethods("Modes de paiement");
		menuI18n4.setPayments("Paiements");
		menuI18n4.setRooms("Chambres");
		menuI18n4.setRoomsTypes("Types de pi??ces");
		menuI18n4.setSubrcribers("Abonn??s");
		menuI18n4.setUsers("Utilisateurs");
		menuI18n4.setWebsite("Site Web");
		menuI18n4.setRequests("Demandes");
		menuI18n4.setLang("FR");
		menuI18n4.setFoods("Aliments");
		menuI18n4.setFoodcategories("Cat??gories d'aliments");
		menuI18n4.setEmployees("Employ??s");
		menuI18n4.setDepartements("D??partements");
		menuI18n4.setDesignations("D??signations");
		menuI18n4.setShifts("Shifts");
		menuI18n4.setHousekeeping("Entretien de la maison");
		menuI18n4.setHousekeepingitems ("Articles d'entretien m??nager");
		menuI18n4.setSubrcribers("Abonn??s");
		menuI18n4.setSettings("Param??tres");
		menuI18n4.setProfile("Profil");
		menuI18n4.setLogout("D??connexion");
		menuI18n4.setOrders("Ordres");
		menuI18n4.setBlogcategories("Blog Categories");
		menuI18n4.setBeds("Lit");
		menuI18n4.setAmenities("Agr??ments");
		uiMenuI18nRepository.save(menuI18n4);
		
		menuI18n5.setAmenities ("Servicios");
		menuI18n5.setOrders ("Pedidos");
		menuI18n5.setBeds ("Camas");
		menuI18n5.setBlogcategories ("Categor??as de blogs");
		menuI18n5.setBlogs ("Blogs");
		menuI18n5.setChekins ("Registrarse");
		menuI18n5.setCities ("Ciudades");
		menuI18n5.setCms ("CMS");
		menuI18n5.setChekins ("Entradas");
		menuI18n5.setCountries ("Pa??ses");
		menuI18n5.setCustomers ("Clientes");
		menuI18n5.setDashboard ("Panel de control");
		menuI18n5.setDocumentation ("Documentaci??n");
		menuI18n5.setExpenses ("Gastos");
		menuI18n5.setExpensescategories ("Categor??as de gastos");
		menuI18n5.setExtrabedorder ("Pedidos de camas adicionales");
		menuI18n5.setExtrabedrequest ("Camas adicionales RQ");
		menuI18n5.setFacilities ("Instalaciones");
		menuI18n5.setFoodorder ("Pedidos de comida");
		menuI18n5.setFoodrequest ("Alimentos RQ");
		menuI18n5.setGalleries ("Galer??as");
		menuI18n5.setGuests ("Invitados");
		menuI18n5.setGuesttypes ("Tipos de invitado");
		menuI18n5.setHousekeepingorder ("Mantenimiento de la casa O");
		menuI18n5.setHousekeepingrequest ("House Keeping RQ");
		menuI18n5.setInformations ("Informaci??n del hotel");
		menuI18n5.setLaundries ("Lavander??as");
		menuI18n5.setLaundryitems ("Art??culos de lavander??a");
		menuI18n5.setLaundryorder ("Pedidos de Landry");
		menuI18n5.setLocations ("Ubicaciones");
		menuI18n5.setLaundryrequest ("Servicio de lavander??a RQ");
		menuI18n5.setMessages ("Mensajes");
		menuI18n5.setOffers ("Ofertas");
		menuI18n5.setPaymentmethods ("M??todos de pago");
		menuI18n5.setPayments ("Pagos");
		menuI18n5.setRooms ("Habitaciones");
		menuI18n5.setRoomsTypes ("Tipos de habitaciones");
		menuI18n5.setSubrcribers ("Suscriptores");
		menuI18n5.setUsers ("Usuarios");
		menuI18n5.setWebsite ("Sitio web");
		menuI18n5.setRequests ("Solicitudes");
		menuI18n5.setLang ("ES");
		menuI18n5.setFoods ("Alimentos");
		menuI18n5.setFoodcategories ("Categor??as de alimentos");
		menuI18n5.setEmployees ("Empleados");
		menuI18n5.setDepartements ("Departements");
		menuI18n5.setDesignations ("Designaciones");
		menuI18n5.setShifts ("Turnos");
		menuI18n5.setHousekeeping ("Mantenimiento de la casa");
		menuI18n5.setHousekeepingitems ("Art??culos de mantenimiento del hogar");
		menuI18n5.setSubrcribers ("Suscriptores");
		menuI18n5.setSettings ("Configuraci??n");
		menuI18n5.setProfile ("Perfil");
		menuI18n5.setLogout ("Cerrar sesi??n");
		uiMenuI18nRepository.save (menuI18n5);
		

	}

}
