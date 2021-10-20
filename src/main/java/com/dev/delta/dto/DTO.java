package com.dev.delta.dto;

import com.dev.delta.entities.Amenity;
import com.dev.delta.entities.Bed;
import com.dev.delta.entities.Blog;
import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.City;
import com.dev.delta.entities.Country;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.Expense;
import com.dev.delta.entities.ExpenseCategory;
import com.dev.delta.entities.ExtraBed;
import com.dev.delta.entities.Food;
import com.dev.delta.entities.FoodCategory;
import com.dev.delta.entities.GuestType;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.Message;
import com.dev.delta.entities.Room;
import com.dev.delta.entities.RoomType;
import com.dev.delta.entities.User;
import com.github.javafaker.Faker;

public interface DTO {
	Faker faker = new Faker();
	public User user = new User();
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
    
	public void populate();
}
