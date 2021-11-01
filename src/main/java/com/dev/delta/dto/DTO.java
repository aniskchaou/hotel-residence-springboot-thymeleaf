package com.dev.delta.dto;

import com.dev.delta.email.EmailSetting;
import com.dev.delta.entities.Amenity;
import com.dev.delta.entities.Bed;
import com.dev.delta.entities.Blog;
import com.dev.delta.entities.BlogCategory;
import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.City;
import com.dev.delta.entities.Country;
import com.dev.delta.entities.Currency;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.Designation;
import com.dev.delta.entities.Expense;
import com.dev.delta.entities.ExpenseCategory;
import com.dev.delta.entities.ExtraBed;
import com.dev.delta.entities.Food;
import com.dev.delta.entities.FoodCategory;
import com.dev.delta.entities.Gallery;
import com.dev.delta.entities.GuestType;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.Message;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Offer;
import com.dev.delta.entities.Role;
import com.dev.delta.entities.Room;
import com.dev.delta.entities.RoomType;
import com.dev.delta.entities.Shift;
import com.dev.delta.entities.User;
import com.dev.delta.i18n.entities.AmenityI18n;
import com.dev.delta.i18n.entities.WebsiteAboutI18n;
import com.dev.delta.i18n.entities.WebsiteBlogI18n;
import com.dev.delta.i18n.entities.WebsiteContactI18n;
import com.dev.delta.i18n.entities.WebsiteFooterI18n;
import com.dev.delta.i18n.entities.WebsiteHomeI18n;
import com.dev.delta.i18n.entities.WebsiteMenuI18n;
import com.dev.delta.i18n.entities.WebsiteRoomI18n;
import com.dev.delta.i18n.entities.WebsiteSignInI18n;
import com.github.javafaker.Faker;

public interface DTO {
	Faker faker = new Faker();
	public User user = new User();
	public User user1 = new User();
	public InformationHotel informationHotel = new InformationHotel();
	Amenity amenity = new Amenity();
	Amenity amenity1 = new Amenity();
	Amenity amenity2 = new Amenity();
	Amenity amenity3 = new Amenity();
	Amenity amenity4 = new Amenity();
	CheckIn checkIn = new CheckIn();
	RoomType roomType1 = new RoomType();
	RoomType roomType2 = new RoomType();
	RoomType roomType3 = new RoomType();
	Message message = new Message();
	City city = new City();
	Country country = new Country();
	GuestType guestType1 = new GuestType();
	GuestType guestType2 = new GuestType();
	Customer customer=new Customer();
	Blog blog=new Blog();
	Room room=new Room();
	ExtraBed extraBed=new ExtraBed();
	Bed bed=new Bed();
	Expense expense=new Expense();
	ExpenseCategory expenseCategory=new ExpenseCategory();
	ExpenseCategory expenseCategory2=new ExpenseCategory();
	Food food=new Food();
	FoodCategory foodCategory=new FoodCategory();
	FoodCategory foodCategory2=new FoodCategory();
	Shift shift=new Shift();
    Designation designation=new Designation();
    Blog  blog2=new Blog();
    Blog blog3=new Blog();
    Blog blog4=new Blog();
    BlogCategory blogCategory=new BlogCategory();
    BlogCategory blogCategory1=new BlogCategory();
    BlogCategory blogCategory2=new BlogCategory();
    BlogCategory blogCategory3=new BlogCategory();
    Gallery gallery=new Gallery();
    Gallery gallery2=new Gallery();
    Gallery gallery3=new Gallery();
    Gallery gallery4=new Gallery();
    Offer offer=new Offer();
    Offer offer2=new Offer();
    Offer offer3=new Offer();
    EmailSetting emailSetting=new EmailSetting();
    Currency currency=new Currency();
    Notification notification=new Notification();
    Role role=new Role();
    Role role2=new Role();
    Role role3=new Role();
    User user3=new User();
    
    
    
    
    
    
    
    
    
    
    AmenityI18n amenityI18n=new AmenityI18n();
    WebsiteMenuI18n websiteMenuI18n=new WebsiteMenuI18n();
    WebsiteMenuI18n websiteMenu2I18n=new WebsiteMenuI18n();
    WebsiteMenuI18n websiteMenu3I18n=new WebsiteMenuI18n();
    WebsiteMenuI18n websiteMenu4I18n=new WebsiteMenuI18n();
    
    WebsiteHomeI18n websiteHomeI18n=new WebsiteHomeI18n();
    WebsiteHomeI18n websiteHomeI18n2=new WebsiteHomeI18n();
    
    WebsiteAboutI18n  websiteAboutI18n=new WebsiteAboutI18n();
    WebsiteAboutI18n  websiteAboutI18n2=new WebsiteAboutI18n();
    
    WebsiteBlogI18n websiteBlogI18n=new WebsiteBlogI18n();
    WebsiteBlogI18n websiteBlogI18n2=new WebsiteBlogI18n();
    
    WebsiteContactI18n websiteContactI18n=new WebsiteContactI18n();
    WebsiteContactI18n websiteContactI18n2=new WebsiteContactI18n();
    
    WebsiteFooterI18n websiteFooterI18n=new WebsiteFooterI18n();
    WebsiteFooterI18n websiteFooterI18n2=new WebsiteFooterI18n();
    
    WebsiteRoomI18n  websiteRoomI18n=new WebsiteRoomI18n();
    WebsiteRoomI18n  websiteRoomI18n2=new WebsiteRoomI18n();
    
    WebsiteSignInI18n websiteSignInI18n=new WebsiteSignInI18n();
    WebsiteSignInI18n websiteSignInI18n2=new WebsiteSignInI18n();
    
    
    
    
    
    
    
	public void populate();
}
