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
		menuI18n2.setEmployees("Employees");
		menuI18n2.setFoodcategories("Food Categories");
		menuI18n2.setAmenities("Amenities");
		menuI18n2.setBeds("Beds");
		menuI18n2.setBlogcategories("Blog Categories");
		menuI18n2.setBlogs("Blogs");
		menuI18n2.setOrders("Orders");
		menuI18n2.setRequests("Requests");
		menuI18n2.setChekins("Check in");
		menuI18n2.setCities("Cities");
		menuI18n2.setCms("CMS");
		menuI18n2.setFoods("Foods");
		menuI18n2.setCountries("Countries");
		menuI18n2.setCustomers("Customers");
		menuI18n2.setDashboard("Dashboard");
		menuI18n2.setDocumentation("Documentation");
		menuI18n2.setExpenses("Expenses");
		menuI18n2.setExpensescategories("Expense Categories");
		menuI18n2.setExtrabedorder("Extra Beds Orders");
		menuI18n2.setExtrabedrequest("Extra Beds RQ");
		menuI18n2.setFacilities("Facilities");
		menuI18n2.setFoodorder("Food Orders");
		menuI18n2.setFoodrequest("Food RQ");
		menuI18n2.setGalleries("Galleries");
		menuI18n2.setGuests("Guests");
		menuI18n2.setGuesttypes("Guest Types");
		menuI18n2.setHousekeepingorder("House Keeping Or");
		menuI18n2.setHousekeepingrequest("House Keeping RQ");
		menuI18n2.setInformations("Hotel infos");
		menuI18n2.setLaundries("Laundries");
		menuI18n2.setLaundryitems("Laundry Items");
		menuI18n2.setLaundryorder("Landry Orders");
		menuI18n2.setLocations("Locations");
		menuI18n2.setLaundryrequest("Laundry RQ");
		menuI18n2.setMessages("Messages");
		menuI18n2.setOffers("Offers");
		menuI18n2.setPaymentmethods("Payment Methods");
		menuI18n2.setPayments("Payments");
		menuI18n2.setRooms("Rooms");
		menuI18n2.setRoomsTypes("Room Types");
		menuI18n2.setSubrcribers("Subscribers");
		menuI18n2.setUsers("Users");
		menuI18n2.setWebsite("Website");
		menuI18n2.setLang("DE");
		menuI18n2.setFoods("Foods");
		menuI18n2.setFoodcategories("Food Categories");
		menuI18n2.setEmployees("Employees");
		menuI18n2.setDepartements("Departements");
		menuI18n2.setDesignations("Designations");
		menuI18n2.setShifts("Shifts");
		menuI18n2.setHousekeeping("House Keeping");
		menuI18n2.setHousekeepingitems("House Keeping Items");
		menuI18n2.setSubrcribers("Subscribers");
		menuI18n2.setSettings("Einstellungen");
		
		uiMenuI18nRepository.save(menuI18n2);
		
		
		

	}

}
