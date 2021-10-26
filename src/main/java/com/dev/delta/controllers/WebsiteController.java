package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.Blog;
import com.dev.delta.entities.BlogCategory;
import com.dev.delta.entities.Gallery;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.Message;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Offer;
import com.dev.delta.repositories.FoodOrderRespository;
import com.dev.delta.repositories.HouseKeepingItemRespository;
import com.dev.delta.repositories.InformationRepository;
import com.dev.delta.repositories.LaundryOrderRepository;
import com.dev.delta.repositories.MessageRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.repositories.OfferRepository;
import com.dev.delta.services.BedService;
import com.dev.delta.services.BlogCategoryService;
import com.dev.delta.services.BlogService;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.GalleryService;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.OfferService;
import com.dev.delta.services.RoomService;
import com.dev.delta.services.RoomTypeService;
import com.dev.delta.services.SubscriberService;

@Controller
public class WebsiteController {

	@Autowired
	InformationRepository informationService;

	@Autowired
	private CheckInService checkInService;

	@Autowired
	private CityService cityService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private GuestTypeService guestTypeService;

	@Autowired
	private RoomTypeService roomTypeService;

	@Autowired
	private BlogService blogService;

	@Autowired
	private BlogCategoryService blogCategoryService;

	@Autowired
	private GalleryService galleryService;

	@Autowired
	OfferService offerService;
	
	@Autowired
	MessageRepository messageRepository;
	
	@Autowired
	NotificationRepository notificationRepository;
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	CustomerService   customerService;
	
	@Autowired
	BedService   bedService;
	
	@Autowired
	EmployeeService  employeeService;
	
	@Autowired
	LaundryOrderRepository laundryOrderRepository;
	
	@Autowired
	FoodOrderRespository  foodOrderRespository;
	
	@Autowired
	OfferRepository offerRepository;
	
	@Autowired
	HouseKeepingItemRespository  houseKeepingItemRespository;
	
	@Autowired
	SubscriberService  subscriberService;
	
	@GetMapping("/dashboard")
	public String homeAdmin(Model model) {
		List<Message> messages=messageRepository.findAll();
		List<Notification> notifications=notificationRepository.findAll();
		model.addAttribute("notifications",notifications);
		model.addAttribute("messages",messages);
		Long id=1L;
		InformationHotel hotel=informationService.getById(id);
		int messageNb=(int) messageRepository.count();
		int notificationNb=(int) notificationRepository.count();
		int roomNB=(int) roomService.getCount();
		int checkInNB=(int) checkInService.getCount();
		int bedNB=(int) bedService.getCount();
		int employeeNB=(int) employeeService.getCount();
		int laundryNB=(int) laundryOrderRepository.count();
		int foodNB=(int) foodOrderRespository.count();
		int offerNB=(int) offerRepository.count();
		int housekeepingNB=(int)houseKeepingItemRespository.count();
		int customerNB=(int) customerService.getCount();
		int blogNB=blogService.getCount();
		int subscriberNB=(int) subscriberService.getCount();
		model.addAttribute("messageNB",Integer.toString(messageNb));
		model.addAttribute("notificationNB",Integer.toString(notificationNb) );
		model.addAttribute("roomNB",Integer.toString(roomNB));
		model.addAttribute("checkinNB",Integer.toString(checkInNB) );
		model.addAttribute("bedNB",Integer.toString(bedNB));
		model.addAttribute("employeeNB",Integer.toString(employeeNB) );
		model.addAttribute("laundryNB",Integer.toString(laundryNB));
		model.addAttribute("foodNB",Integer.toString(foodNB) );
		model.addAttribute("offerNB",Integer.toString(offerNB) );
		model.addAttribute("housekeepingNB",Integer.toString(housekeepingNB) );
		model.addAttribute("customerNB",Integer.toString(customerNB) );
		model.addAttribute("blogNB",Integer.toString(blogNB) );
		model.addAttribute("subscriberNB",Integer.toString(subscriberNB) );
		model.addAttribute("hotel",hotel );
		
		return "home/index";
	}

	@GetMapping("/")
	public String home(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		List<Offer> offers=offerService.getOffers();
		model.addAttribute("offers",offers);
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		model.addAttribute("image", "1");
		List<Gallery> galleries = galleryService.getGalleries();
		model.addAttribute("galleries", galleries);
		return "website/index";
	}

	@GetMapping("/about")
	public String about(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		return "website/about";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		return "website/contact";
	}

	@GetMapping("/blog")
	public String blog(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		List<Blog> blogs = blogService.getBlogs();
		List<BlogCategory> blogCategories = blogCategoryService.getBlogCategories();
		model.addAttribute("items", blogs);
		model.addAttribute("categories", blogCategories);
		return "website/blog";
	}
}
