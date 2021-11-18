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
		
		
		menuI18n3.setAmenities ("المرافق") ;
		menuI18n3.setOrders ("الطلبات") ;
		menuI18n3.setBeds ("الأسرة") ;
		menuI18n3.setBlogcategories ("فئات المدونة") ;
		menuI18n3.setBlogs ("المدونات") ;
		menuI18n3.setChekins ("تسجيل الوصول") ;
		menuI18n3.setCities ("المدن") ;
		menuI18n3.setCms ("CMS") ;
		menuI18n3.setChekins ("تسجيلات الوصول") ;
		menuI18n3.setCountries ("البلدان") ;
		menuI18n3.setCustomers ("العملاء") ;
		menuI18n3.setDashboard ("لوحة القيادة") ;
		menuI18n3.setDocumentation ("الوثائق") ;
		menuI18n3.setExpenses ("المصاريف") ;
		menuI18n3.setExpensescategories ("فئات المصاريف") ;
		menuI18n3.setExtrabedorder ("طلبات الأسرة الإضافية") ;
		menuI18n3.setExtrabedrequest ("سرير إضافي RQ") ;
		menuI18n3.setFacilities ("المرافق") ;
		menuI18n3.setFoodorder ("طلبات الطعام") ;
		menuI18n3.setFoodrequest ("Food RQ") ;
		menuI18n3.setGalleries ("المعارض") ;
		menuI18n3.setGuests ("الضيوف") ;
		menuI18n3.setGuesttypes ("أنواع الضيف") ;
		menuI18n3.setHousekeepingorder ("التدبير المنزلي أو") ;
		menuI18n3.setHousekeepingrequest ("House Keeping RQ") ;
		menuI18n3.setInformations ("معلومات الفندق") ;
		menuI18n3.setLaundries ("مغاسل") ;
		menuI18n3.setLaundryitems ("مواد الغسيل") ;
		menuI18n3.setLaundryorder ("طلبات الأراضي") ;
		menuI18n3.setLocations ("المواقع") ;
		menuI18n3.setLaundryrequest ("Laundry RQ") ;
		menuI18n3.setMessages ("الرسائل") ;
		menuI18n3.setOffers ("العروض") ;
		menuI18n3.setPaymentmethods ("طرق الدفع") ;
		menuI18n3.setPayments ("المدفوعات") ;
		menuI18n3.setRooms ("الغرف") ;
		menuI18n3.setRoomsTypes ("أنواع الغرف") ;
		menuI18n3.setSubrcribers ("المشتركون") ;
		menuI18n3.setUsers("المستخدمون") ;
		menuI18n3.setWebsite ("موقع الويب") ;
		menuI18n3.setRequests ("الطلبات") ;
		menuI18n3.setLang ("AR") ;
		menuI18n3.setFoods ("الأطعمة") ;
		menuI18n3.setFoodcategories ("فئات الأطعمة") ;
		menuI18n3.setEmployees ("الموظفون") ;
		menuI18n3.setDepartements ("الأقسام") ;
		menuI18n3.setDesignations ("التعيينات") ;
		menuI18n3.setShifts ("المناوبات") ;
		menuI18n3.setHousekeeping ("التدبير المنزلي") ;
		menuI18n3.setHousekeepingitems ("أدوات التدبير المنزلي") ;
		menuI18n3.setSubrcribers ("المشتركون") ;
		menuI18n3.setSettings ("الإعدادات") ;
		menuI18n3.setProfile ("الملف الشخصي") ;
		menuI18n3.setLogout ("تسجيل الخروج") ;
		uiMenuI18nRepository.save (menuI18n3) ;

		menuI18n.setAmenities("Aménagements");
		menuI18n.setOrders("Commandes");
		menuI18n.setBeds("Lits");
		menuI18n.setBlogcategories("Catégories de blog");
		menuI18n4.setBlogs("Blogs");
		menuI18n4.setChekins("Enregistrement");
		menuI18n4.setCities("Villes");
		menuI18n4.setCms("CMS");
		menuI18n4.setChekins("Enregistrements");
		menuI18n4.setCountries("Pays");
		menuI18n4.setCustomers("Clients");
		menuI18n4.setDashboard("Tableau de bord");
		menuI18n4.setDocumentation("Documentation");
		menuI18n4.setExpenses("Dépenses");
		menuI18n4.setExpensescategories("Catégories de dépenses");
		menuI18n4.setExtrabedorder("Commandes de lits supplémentaires");
		menuI18n4.setExtrabedrequest("Lits supplémentaires RQ");
		menuI18n4.setFacilities("Installations");
		menuI18n4.setFoodorder("Commandes alimentaires");
		menuI18n4.setFoodrequest("Nourriture RQ");
		menuI18n4.setGalleries("Galeries");
		menuI18n4.setGuests("Invités");
		menuI18n4.setGuesttypes("Types d'invités");
		menuI18n4.setHousekeepingorder("Maison Ou");
		menuI18n4.setHousekeepingrequest("House Keeping RQ");
		menuI18n4.setInformations("Infos hôtel");
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
		menuI18n4.setRoomsTypes("Types de pièces");
		menuI18n4.setSubrcribers("Abonnés");
		menuI18n4.setUsers("Utilisateurs");
		menuI18n4.setWebsite("Site Web");
		menuI18n4.setRequests("Demandes");
		menuI18n4.setLang("FR");
		menuI18n4.setFoods("Aliments");
		menuI18n4.setFoodcategories("Catégories d'aliments");
		menuI18n4.setEmployees("Employés");
		menuI18n4.setDepartements("Départements");
		menuI18n4.setDesignations("Désignations");
		menuI18n4.setShifts("Shifts");
		menuI18n4.setHousekeeping("Entretien de la maison");
		menuI18n4.setHousekeepingitems ("Articles d'entretien ménager");
		menuI18n4.setSubrcribers("Abonnés");
		menuI18n4.setSettings("Paramètres");
		menuI18n4.setProfile("Profil");
		menuI18n4.setLogout("Déconnexion");
		menuI18n4.setOrders("Ordres");
		menuI18n4.setBlogcategories("Blog Categories");
		menuI18n4.setBeds("Lit");
		menuI18n4.setAmenities("Agréments");
		uiMenuI18nRepository.save(menuI18n4);
		
		menuI18n5.setAmenities ("Servicios");
		menuI18n5.setOrders ("Pedidos");
		menuI18n5.setBeds ("Camas");
		menuI18n5.setBlogcategories ("Categorías de blogs");
		menuI18n5.setBlogs ("Blogs");
		menuI18n5.setChekins ("Registrarse");
		menuI18n5.setCities ("Ciudades");
		menuI18n5.setCms ("CMS");
		menuI18n5.setChekins ("Entradas");
		menuI18n5.setCountries ("Países");
		menuI18n5.setCustomers ("Clientes");
		menuI18n5.setDashboard ("Panel de control");
		menuI18n5.setDocumentation ("Documentación");
		menuI18n5.setExpenses ("Gastos");
		menuI18n5.setExpensescategories ("Categorías de gastos");
		menuI18n5.setExtrabedorder ("Pedidos de camas adicionales");
		menuI18n5.setExtrabedrequest ("Camas adicionales RQ");
		menuI18n5.setFacilities ("Instalaciones");
		menuI18n5.setFoodorder ("Pedidos de comida");
		menuI18n5.setFoodrequest ("Alimentos RQ");
		menuI18n5.setGalleries ("Galerías");
		menuI18n5.setGuests ("Invitados");
		menuI18n5.setGuesttypes ("Tipos de invitado");
		menuI18n5.setHousekeepingorder ("Mantenimiento de la casa O");
		menuI18n5.setHousekeepingrequest ("House Keeping RQ");
		menuI18n5.setInformations ("Información del hotel");
		menuI18n5.setLaundries ("Lavanderías");
		menuI18n5.setLaundryitems ("Artículos de lavandería");
		menuI18n5.setLaundryorder ("Pedidos de Landry");
		menuI18n5.setLocations ("Ubicaciones");
		menuI18n5.setLaundryrequest ("Servicio de lavandería RQ");
		menuI18n5.setMessages ("Mensajes");
		menuI18n5.setOffers ("Ofertas");
		menuI18n5.setPaymentmethods ("Métodos de pago");
		menuI18n5.setPayments ("Pagos");
		menuI18n5.setRooms ("Habitaciones");
		menuI18n5.setRoomsTypes ("Tipos de habitaciones");
		menuI18n5.setSubrcribers ("Suscriptores");
		menuI18n5.setUsers ("Usuarios");
		menuI18n5.setWebsite ("Sitio web");
		menuI18n5.setRequests ("Solicitudes");
		menuI18n5.setLang ("ES");
		menuI18n5.setFoods ("Alimentos");
		menuI18n5.setFoodcategories ("Categorías de alimentos");
		menuI18n5.setEmployees ("Empleados");
		menuI18n5.setDepartements ("Departements");
		menuI18n5.setDesignations ("Designaciones");
		menuI18n5.setShifts ("Turnos");
		menuI18n5.setHousekeeping ("Mantenimiento de la casa");
		menuI18n5.setHousekeepingitems ("Artículos de mantenimiento del hogar");
		menuI18n5.setSubrcribers ("Suscriptores");
		menuI18n5.setSettings ("Configuración");
		menuI18n5.setProfile ("Perfil");
		menuI18n5.setLogout ("Cerrar sesión");
		uiMenuI18nRepository.save (menuI18n5);
		

	}

}
