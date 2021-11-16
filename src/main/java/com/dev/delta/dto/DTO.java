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
import com.dev.delta.entities.Departement;
import com.dev.delta.entities.Designation;
import com.dev.delta.entities.Expense;
import com.dev.delta.entities.ExpenseCategory;
import com.dev.delta.entities.ExtraBed;
import com.dev.delta.entities.ExtraBedRequestOrder;
import com.dev.delta.entities.Food;
import com.dev.delta.entities.FoodCategory;
import com.dev.delta.entities.FoodOrder;
import com.dev.delta.entities.FoodRequestOrder;
import com.dev.delta.entities.Gallery;
import com.dev.delta.entities.GuestType;
import com.dev.delta.entities.HouseKeepingRequestOrder;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.LaundryItem;
import com.dev.delta.entities.LaundryOrder;
import com.dev.delta.entities.LaundryRequestOrder;
import com.dev.delta.entities.Message;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Offer;
import com.dev.delta.entities.Role;
import com.dev.delta.entities.Room;
import com.dev.delta.entities.RoomType;
import com.dev.delta.entities.Shift;
import com.dev.delta.entities.User;
import com.dev.delta.entities.VAT;
import com.dev.delta.i18n.entities.AmenityI18n;
import com.dev.delta.i18n.entities.BedI18n;
import com.dev.delta.i18n.entities.BlogCategoryI18n;
import com.dev.delta.i18n.entities.BlogI18n;
import com.dev.delta.i18n.entities.CheckInI18n;
import com.dev.delta.i18n.entities.CityI18n;
import com.dev.delta.i18n.entities.CountryI18n;
import com.dev.delta.i18n.entities.CurrencyI18n;
import com.dev.delta.i18n.entities.CustomerI18n;
import com.dev.delta.i18n.entities.DepartementI18n;
import com.dev.delta.i18n.entities.DesignationI18n;
import com.dev.delta.i18n.entities.EmailI18n;
import com.dev.delta.i18n.entities.EmployeeI18n;
import com.dev.delta.i18n.entities.ExpenseCategoryI18n;
import com.dev.delta.i18n.entities.ExpenseI18n;
import com.dev.delta.i18n.entities.ExtraBedI18n;
import com.dev.delta.i18n.entities.ExtraBedRequestI18n;
import com.dev.delta.i18n.entities.FoodCategoryI18n;
import com.dev.delta.i18n.entities.FoodI18n;
import com.dev.delta.i18n.entities.FoodOrderI18n;
import com.dev.delta.i18n.entities.FoodRequestI18n;
import com.dev.delta.i18n.entities.GalleryI18n;
import com.dev.delta.i18n.entities.GuestTypeI18n;
import com.dev.delta.i18n.entities.HouseKeepingItemI18n;
import com.dev.delta.i18n.entities.HouseKeepingOrderI18n;
import com.dev.delta.i18n.entities.HouseKeepingRequestI18n;
import com.dev.delta.i18n.entities.InformationHotelI18n;
import com.dev.delta.i18n.entities.LaundryItemI18n;
import com.dev.delta.i18n.entities.LaundryOrderI18n;
import com.dev.delta.i18n.entities.LaundryRequestI18n;
import com.dev.delta.i18n.entities.MessageI18n;
import com.dev.delta.i18n.entities.OfferI18n;
import com.dev.delta.i18n.entities.PaymentI18n;
import com.dev.delta.i18n.entities.PaymentMethodI18n;
import com.dev.delta.i18n.entities.RoomI18n;
import com.dev.delta.i18n.entities.RoomTypeI18n;
import com.dev.delta.i18n.entities.ShiftI18n;
import com.dev.delta.i18n.entities.SubscriberI18n;
import com.dev.delta.i18n.entities.UIHeaderI18n;
import com.dev.delta.i18n.entities.UIMenuI18n;
import com.dev.delta.i18n.entities.UserI18n;
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
	Room room1=new Room();
	Room room2=new Room();
	Room room3=new Room();
	Room room4=new Room();
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
    Customer customer2=new Customer();
    FoodOrder  foodOrder=new FoodOrder();
    LaundryItemI18n laundryItemI18n=new LaundryItemI18n();
    LaundryItemI18n laundryItemI18n2=new LaundryItemI18n();
    Departement  departement=new Departement();
    DepartementI18n  departementI18n=new DepartementI18n();
    DepartementI18n  departementI18n2=new DepartementI18n();
    
    ExtraBedRequestI18n extraBedRequestI18n=new ExtraBedRequestI18n();
    ExtraBedRequestI18n extraBedRequestI18n2=new ExtraBedRequestI18n();
    
    ExtraBedRequestOrder extraBedRequestOrder=new ExtraBedRequestOrder();
    
    VAT vat=new VAT();
    
    
    
    
    
    
    
    //translation
    
    AmenityI18n amenityI18n=new AmenityI18n();
    AmenityI18n amenityI18n2=new AmenityI18n();
    
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
    
    BedI18n bedI18n=new BedI18n();
    BedI18n bedI18n2=new BedI18n();
    
    BlogCategoryI18n  blogCategoryI18n=new BlogCategoryI18n();
    BlogCategoryI18n  blogCategoryI18n2=new BlogCategoryI18n();
    
    BlogI18n blogI18n=new BlogI18n();
    BlogI18n blogI18n2=new BlogI18n();
    
    CheckInI18n checkInI18n=new CheckInI18n();
    CheckInI18n checkInI18n2=new CheckInI18n();
    
    CountryI18n  countryI18n=new CountryI18n();
    CountryI18n  countryI18n2=new CountryI18n();
    
    CurrencyI18n currencyI18n=new CurrencyI18n();
    CurrencyI18n currencyI18n2=new CurrencyI18n();
    
    CustomerI18n customerI18n=new CustomerI18n();
    CustomerI18n customerI18n2=new CustomerI18n();
    
    DesignationI18n  designationI18n=new DesignationI18n();
    DesignationI18n  designationI18n2=new DesignationI18n();
    
    EmployeeI18n employeeI18n=new EmployeeI18n();
    EmployeeI18n employeeI18n2=new EmployeeI18n();
    
    ExpenseI18n expenseI18n=new ExpenseI18n();
    ExpenseI18n expenseI18n2=new ExpenseI18n();
    
    ExpenseCategoryI18n expenseCategoryI18n=new ExpenseCategoryI18n();
    ExpenseCategoryI18n expenseCategoryI18n2=new ExpenseCategoryI18n();
    
    ExtraBedI18n extraBedI18n=new ExtraBedI18n();
    ExtraBedI18n extraBedI18n2=new ExtraBedI18n();
    
    FoodI18n foodI18n=new FoodI18n();
    FoodI18n foodI18n2=new FoodI18n();
    
    GalleryI18n galleryI18n=new GalleryI18n();
    GalleryI18n galleryI18n2=new GalleryI18n();
    
    GuestTypeI18n guestTypeI18n=new GuestTypeI18n();
    GuestTypeI18n guestTypeI18n2=new GuestTypeI18n();
    
    InformationHotelI18n informationHotelI18n=new InformationHotelI18n();
    InformationHotelI18n informationHotelI18n2=new InformationHotelI18n();
    
    MessageI18n messageI18n=new MessageI18n();
    MessageI18n messageI18n2=new MessageI18n();
    
    OfferI18n offerI18n=new OfferI18n();
    OfferI18n offerI18n2=new OfferI18n();
    
    RoomI18n  roomI18n=new RoomI18n();
    RoomI18n  roomI18n2=new RoomI18n();
    
    RoomTypeI18n roomTypeI18n=new RoomTypeI18n();
    RoomTypeI18n roomTypeI18n2=new RoomTypeI18n();
    
    ShiftI18n shiftI18n=new ShiftI18n();
    ShiftI18n shiftI18n2=new ShiftI18n();
    
    UserI18n userI18n=new UserI18n();
    UserI18n userI18n2=new UserI18n();
    
    CityI18n cityI18n=new CityI18n();
    CityI18n cityI18n2=new CityI18n();
    
    UIMenuI18n menuI18n=new UIMenuI18n();
    UIMenuI18n menuI18n2=new UIMenuI18n();
    
    UIHeaderI18n headerI18n=new UIHeaderI18n();
    UIHeaderI18n headerI18n2=new UIHeaderI18n();
    
    SubscriberI18n subscriberI18n=new SubscriberI18n();
    SubscriberI18n subscriberI18n2=new SubscriberI18n();
    
    EmailI18n  emailI18n=new EmailI18n();
    EmailI18n  emailI18n2=new EmailI18n();
    
    FoodCategoryI18n foodCategoryI18n=new FoodCategoryI18n();
    FoodCategoryI18n foodCategoryI18n2=new FoodCategoryI18n();
    
    PaymentI18n  paymentI18n=new PaymentI18n();
    PaymentI18n  paymentI18n2=new PaymentI18n();
    
    PaymentMethodI18n paymentMethodI18n=new PaymentMethodI18n();
    PaymentMethodI18n paymentMethodI18n2=new PaymentMethodI18n();
    
    HouseKeepingItemI18n houseKeepingItemI18n=new HouseKeepingItemI18n();
    HouseKeepingItemI18n houseKeepingItemI18n2=new HouseKeepingItemI18n();
    
    FoodOrderI18n foodOrderI18n=new FoodOrderI18n();
    FoodOrderI18n foodOrderI18n2=new FoodOrderI18n();
    
    HouseKeepingOrderI18n  houseKeepingOrderI18n=new HouseKeepingOrderI18n();
    HouseKeepingOrderI18n  houseKeepingOrderI18n2=new HouseKeepingOrderI18n();

    LaundryOrder  laundryOrder=new LaundryOrder();
    LaundryOrder  laundryOrder2=new LaundryOrder();
    
    LaundryOrderI18n laundryOrderI18n=new LaundryOrderI18n();
    LaundryOrderI18n laundryOrderI18n2=new LaundryOrderI18n();
    
    LaundryItem laundryItem=new LaundryItem();
    
    FoodRequestI18n foodRequestI18n=new FoodRequestI18n();
    FoodRequestI18n foodRequestI18n2=new FoodRequestI18n();
    
    FoodRequestOrder foodRequestOrder=new FoodRequestOrder();
    
    HouseKeepingRequestI18n houseKeepingRequestI18n=new HouseKeepingRequestI18n();
    HouseKeepingRequestI18n houseKeepingRequestI18n2=new HouseKeepingRequestI18n();
    
    HouseKeepingRequestOrder houseKeepingRequestOrder=new HouseKeepingRequestOrder();
    
    LaundryRequestI18n  laundryRequestI18n=new LaundryRequestI18n();
    LaundryRequestI18n  laundryRequestI18n2=new LaundryRequestI18n();
    
    LaundryRequestOrder laundryRequestOrder=new LaundryRequestOrder();
    
    
    
    
    
    
	public void populate();
}
