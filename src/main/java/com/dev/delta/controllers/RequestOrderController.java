package com.dev.delta.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.ExtraBedRequestOrder;
import com.dev.delta.entities.FoodOrder;
import com.dev.delta.entities.FoodRequestOrder;
import com.dev.delta.entities.HouseKeepingRequestOrder;
import com.dev.delta.entities.Invoice;
import com.dev.delta.entities.LaundryOrder;
import com.dev.delta.entities.LaundryRequestOrder;
import com.dev.delta.entities.User;
import com.dev.delta.i18n.entities.BedI18n;
import com.dev.delta.i18n.entities.ExtraBedI18n;
import com.dev.delta.i18n.entities.FoodOrderI18n;
import com.dev.delta.i18n.entities.HouseKeepingOrderI18n;
import com.dev.delta.i18n.entities.LaundryItemI18n;
import com.dev.delta.i18n.entities.LaundryOrderI18n;
import com.dev.delta.i18n.repositories.ExtraBedI18nRepository;
import com.dev.delta.i18n.repositories.FoodOrderI18nRepository;
import com.dev.delta.i18n.repositories.HouseKeepingOrderI18nRepository;
import com.dev.delta.i18n.repositories.LaundryOrderI18nRepository;
import com.dev.delta.repositories.CheckInRepository;
import com.dev.delta.repositories.CustomerRepository;
import com.dev.delta.repositories.ExtraBedRequestRepository;
import com.dev.delta.repositories.FoodOrderRequestRepository;
import com.dev.delta.repositories.HouseKeepingRequestRepository;
import com.dev.delta.repositories.InvoiceRepository;
import com.dev.delta.repositories.LaundryOrderRepository;
import com.dev.delta.security.UserPrincipal;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.ExtraBedRequestService;
import com.dev.delta.services.FoodOrderService;
import com.dev.delta.services.FoodRequestOrderService;
import com.dev.delta.services.FoodService;
import com.dev.delta.services.HouseKeepingRequestOrderService;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.LaundryRequestOrderService;
import com.dev.delta.services.RoomService;
import com.dev.delta.util.UIMenuHeaderUtil;
@Controller
public class RequestOrderController {

	@Autowired
	FoodRequestOrderService foodRequestOrderService;
	@Autowired
	HouseKeepingRequestOrderService houseKeepingRequestOrderService;
	@Autowired
	LaundryRequestOrderService  laundryRequestOrderService;
	@Autowired
	ExtraBedRequestService  extraBedRequestService;
	
	@Autowired
	FoodOrderRequestRepository  foodOrderRequestRepository;
	
	@Autowired
	ExtraBedRequestRepository  bedOrderRepository;
	
	@Autowired
	HouseKeepingRequestRepository  houseKeepingOrderRepository;
	
	@Autowired
	RoomService  roomService;
	
	@Autowired
	CustomerRepository  customerRepository;
	
	@Autowired
	CheckInRepository  checkInRepository;
	
	@Autowired
	LaundryOrderRepository laundryOrderRepository;
	
	
	@Autowired
	InformationService  informationService;
	
	@Autowired
	UIMenuHeaderUtil  menuHeaderUtil;
	
	@Autowired
	HouseKeepingOrderI18nRepository  houseKeepingOrderI18nRepository;
	
	 @Autowired
	 LaundryOrderI18nRepository laundryOrderI18nRepository;
	 
	 @Autowired
	 FoodOrderI18nRepository   foodOrderI18nRepository;
	 
	 @Autowired
	 ExtraBedI18nRepository   extraBedI18nRepository;
	 
	 @Autowired
	 FoodOrderService  foodOrderService ;
	
	@Autowired
	FoodService  foodService ;
	
	
	Invoice invoice;
	
	
	@Autowired
	InvoiceRepository   invoiceRepository;
	
	
	
	@GetMapping("/extrabedrequest")
	public String getextrabedsRequest(Model model) {
		List<ExtraBedRequestOrder> items = extraBedRequestService.getExtraBedRequest();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		ExtraBedI18n houseI18n = extraBedI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "request/extrabedrequest";
	}
	
	
	@GetMapping("/foodrequest")
	public String getFoodRequest(Model model) {
		List<FoodOrder> items = foodOrderService.getFoodOrders();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		FoodOrderI18n houseI18n = foodOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		
		return "request/foodrequestorder";
	}
	
	@GetMapping("/housekeepingrequest")
	public String getHouseKeepingRequest(Model model) {
		List<HouseKeepingRequestOrder> items = houseKeepingRequestOrderService.gethousekeepingRequest();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		HouseKeepingOrderI18n houseI18n = houseKeepingOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "request/housekeepingrequestorder";
	}
	
	@GetMapping("/laundryrequest")
	public String getLaundryOrderRequest(Model model) {
		List<LaundryRequestOrder> items = laundryRequestOrderService.getLaundriesRequest();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		LaundryOrderI18n houseI18n = laundryOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "request/laundryrequestorder";
	}
	
	
	@GetMapping("/addlaundryorder")
	public String addLaundryOrder(Model model) {
		
		return "orderrequest/addlaundryorder";
	}
	
	public Customer getCustomer()
	{
		UserPrincipal principal = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = principal.getUser();
		Customer customer = customerRepository.findByUser(user);
		System.err.println(customer);
		return customer;
	}
	
	public List<CheckIn> getByCustomer(Customer customer)
	{
		return checkInRepository.findByCutomer(customer);
	}
	
	@GetMapping("/addhousekeepingorder")
	public String addHouseKeepingOrder(Model model) {
		model.addAttribute("rooms", roomService.getRooms());
		model.addAttribute("customer", getCustomer());
		
		
		
		return "orderrequest/addhousekeepingorder";
	}
	
	@GetMapping("/addextrabedorder")
	public String addExtraBedOrder(Model model) {
	
		model.addAttribute("customer", getCustomer());
		model.addAttribute("rooms", roomService.getRooms());
		
		
		
		return "orderrequest/addextrabedorder";
	}
	
	@GetMapping("/addfoodorder")
	public String addFoodOrder(Model model) {
		model.addAttribute("foods", foodService.getFoods());
		model.addAttribute("customer", getCustomer());
		model.addAttribute("rooms", roomService.getRooms());
		
		
		return "orderrequest/addfoodorder";
	}
	
	
	@PostMapping("/addfoodorderrequest")
	public String saveFoodOrder(FoodRequestOrder foodRequestOrder) {
		System.err.println(foodRequestOrder.toString());
		foodOrderRequestRepository.save(foodRequestOrder);
		/*invoice.setCheckIn(foodRequestOrder.get);
		invoice.setCreateAt(new Date().toString());
		invoice.setService();
		invoice.setVat(null);*/
		
		System.err.println(foodRequestOrder.toString());
		return "redirect:/dashboard";
	}
	
	
	
	@PostMapping("/addextrabedorder")
	public String saveExtraBedOrder(ExtraBedRequestOrder bedRequestOrder) {
		bedOrderRepository.save(bedRequestOrder);
		//invoice.setCheckIn(bedRequestOrder.get);
		   invoice=new Invoice();
		  invoice.setCheckIn(bedRequestOrder.getCheckin());
	        invoice.setCreateAt(new Date().toString());
	        invoice.setPrice(bedRequestOrder.getPrice());
	        invoice.setService("extra Bed "+bedRequestOrder.getExtraBed());
	        invoiceRepository.save(invoice);
		System.err.println(bedRequestOrder.toString());
		return "redirect:/dashboard";
	}
	
	
	@PostMapping("/addhousekeepingorder")
	public String saveHouseKeepingOrder(HouseKeepingRequestOrder houseKeepingRequestOrder) {
		houseKeepingOrderRepository.save(houseKeepingRequestOrder);
		
		invoice=new Invoice();
		  invoice.setCheckIn(houseKeepingRequestOrder.getCheckin());
	        invoice.setCreateAt(new Date().toString());
	        invoice.setPrice(houseKeepingRequestOrder.getPrice());
	        invoice.setService("House keeping "+houseKeepingRequestOrder.getHousekeepingItem());
	        invoiceRepository.save(invoice);
	        
		return "redirect:/dashboard";
	}
	
	@PostMapping("/addlaundryorder")
	public String saveLaundryOrder(LaundryOrder laundryOrder ) {
		laundryOrderRepository.save(laundryOrder);
		
		invoice=new Invoice();
		  invoice.setCheckIn(laundryOrder.getCheckin());
	        invoice.setCreateAt(new Date().toString());
	        invoice.setPrice(laundryOrder.getPrice());
	        invoice.setService("Laundry order "+laundryOrder.getLaundryitem());
	        invoiceRepository.save(invoice);
		return "redirect:/dashboard";
	}
	
	
	
	
}
