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
		menuI18n2.setOrders("Aufträge");
		menuI18n2.setRequests("Anfragen");
		menuI18n2.setChekins("Einchecken");
		menuI18n2.setCities("Städte");
		menuI18n2.setCms("CMS");
		menuI18n2.setFoods("Lebensmittel");
		menuI18n2.setCountries("Länder");
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
		menuI18n2.setGuests("Gäste");
		menuI18n2.setGuesttypes("Gasttypen");
		menuI18n2.setHousekeepingorder("Zimmerreinigung ");
		menuI18n2.setHousekeepingrequest("Zimmerreinigung ");
		menuI18n2.setInformations("Hotelinformationen");
		menuI18n2.setLaundries("Wäschereien");
		menuI18n2.setLaundryitems("Wäscheartikel");
		menuI18n2.setLaundryorder("Landry-Bestellungen");
		menuI18n2.setLocations("Standorte");
		menuI18n2.setLaundryrequest("Wäschereien");
		menuI18n2.setMessages("Nachrichten");
		menuI18n2.setOffers("Angebote");
		menuI18n2.setPaymentmethods("Zahlungsmethoden");
		menuI18n2.setPayments("Zahlungen");
		menuI18n2.setRooms("Räume");
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
		
		
		

	}

}
