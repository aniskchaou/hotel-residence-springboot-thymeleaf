package com.dev.delta.controllers;

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
import com.dev.delta.entities.FoodRequestOrder;
import com.dev.delta.entities.HouseKeepingRequestOrder;
import com.dev.delta.entities.LaundryRequestOrder;
import com.dev.delta.entities.User;
import com.dev.delta.repositories.CheckInRepository;
import com.dev.delta.repositories.CustomerRepository;
import com.dev.delta.repositories.ExtraBedRequestRepository;
import com.dev.delta.repositories.FoodOrderRequestRepository;
import com.dev.delta.repositories.HouseKeepingRequestRepository;
import com.dev.delta.security.UserPrincipal;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.ExtraBedRequestService;
import com.dev.delta.services.FoodRequestOrderService;
import com.dev.delta.services.FoodService;
import com.dev.delta.services.HouseKeepingRequestOrderService;
import com.dev.delta.services.LaundryRequestOrderService;
import com.dev.delta.services.RoomService;
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
	FoodService  foodService ;
	@GetMapping("/extrabedrequest")
	public String getextrabedsRequest(Model model) {
		List<ExtraBedRequestOrder> items = extraBedRequestService.getExtraBedRequest();
		model.addAttribute("items", items);
		return "request/extrabedrequest";
	}
	
	
	
	
	@GetMapping("/housekeepingrequest")
	public String getHouseKeepingRequest(Model model) {
		List<HouseKeepingRequestOrder> items = houseKeepingRequestOrderService.gethousekeepingRequest();
		model.addAttribute("items", items);
		return "request/housekeepingrequestorder";
	}
	
	@GetMapping("/laundryrequest")
	public String getLaundryOrderRequest(Model model) {
		List<LaundryRequestOrder> items = laundryRequestOrderService.getLaundriesRequest();
		model.addAttribute("items", items);
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
		return "redirect:/dashboard";
	}
	
	@PostMapping("/addextrabedorder")
	public String saveExtraBedOrder(ExtraBedRequestOrder bedRequestOrder) {
		bedOrderRepository.save(bedRequestOrder);
		System.err.println(bedRequestOrder.toString());
		return "redirect:/dashboard";
	}
	
	
	@PostMapping("/addhousekeepingorder")
	public String saveHouseKeepingOrder(HouseKeepingRequestOrder houseKeepingRequestOrder) {
		houseKeepingOrderRepository.save(houseKeepingRequestOrder);
		return "redirect:/dashboard";
	}
	
}
