package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.delta.dto.AmenityDTO;
import com.dev.delta.dto.BedDTO;
import com.dev.delta.dto.BlogCategoryDTO;
import com.dev.delta.dto.BlogDTO;
import com.dev.delta.dto.CheckInDTO;
import com.dev.delta.dto.CityDTO;
import com.dev.delta.dto.CountryDTO;
import com.dev.delta.dto.CurrencyDTO;
import com.dev.delta.dto.CustomerDTO;
import com.dev.delta.dto.DesignationDTO;
import com.dev.delta.dto.EmailDTO;
import com.dev.delta.dto.ExpenseCategoryDTO;
import com.dev.delta.dto.ExpenseDTO;
import com.dev.delta.dto.ExtraBedDTO;
import com.dev.delta.dto.FoodCategoryDTO;
import com.dev.delta.dto.FoodDTO;
import com.dev.delta.dto.GalleryDTO;
import com.dev.delta.dto.GuestTypeDTO;
import com.dev.delta.dto.InformationHotelDTO;
import com.dev.delta.dto.OfferDTO;
import com.dev.delta.dto.RoomDTO;
import com.dev.delta.dto.RoomTypeDTO;
import com.dev.delta.dto.ShiftDTO;
import com.dev.delta.dto.UserDTO;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringbootHotelResidenceCodecanyonApplication implements CommandLineRunner{

	@Autowired
	UserDTO userDTO;
	
	@Autowired
	InformationHotelDTO informationHotelDTO;
	
	@Autowired
	CheckInDTO checkInDTO;
	
	@Autowired
	RoomTypeDTO roomTypeDTO;
	
	@Autowired
	AmenityDTO amenityDTO;
	
	@Autowired
	GuestTypeDTO guestTypeDTO;
	
	@Autowired
	CityDTO cityDTO;
	
	@Autowired
	CountryDTO countryDTO;
	
	@Autowired
	BlogDTO blogDTO;
	
	@Autowired
	CustomerDTO customerDTO;
	
	@Autowired
	RoomDTO roomDTO ;
	
	@Autowired
	ExtraBedDTO  extraBedDTO;
	
	@Autowired
	BedDTO bedDTO;
	
	@Autowired
	ExpenseDTO expenseDTO;
	
	@Autowired
	ExpenseCategoryDTO expenseCategoryDTO;
	
	@Autowired
	FoodCategoryDTO foodCategoryDTO;
	
	@Autowired
	FoodDTO foodDTO;
	
	
	@Autowired
	ShiftDTO shiftDTO;
	
	@Autowired
	DesignationDTO designationDTO;
	
	@Autowired
	BlogCategoryDTO  blogCategoryDTO;
	
	@Autowired
	GalleryDTO  galleryDTO;
	
	@Autowired
	OfferDTO  offerDTO;
	
	@Autowired
	EmailDTO emailDTO;
	
	@Autowired
	CurrencyDTO currencyDTO;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHotelResidenceCodecanyonApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		userDTO.populate();
		blogCategoryDTO.populate();
		amenityDTO.populate();
		informationHotelDTO.populate();
		roomTypeDTO.populate();
		guestTypeDTO.populate();
		cityDTO.populate();
		countryDTO.populate();
	    checkInDTO.populate();
	    blogDTO.populate();
	    customerDTO.populate();
	    roomDTO.populate();
	    extraBedDTO.populate();
	    bedDTO.populate();
	    expenseCategoryDTO.populate();
	    expenseDTO.populate();
	    foodCategoryDTO.populate();
	    foodDTO.populate();
	    shiftDTO.populate();
	    designationDTO.populate();
	    galleryDTO.populate();  
	    offerDTO.populate();
	    emailDTO.populate();
	    currencyDTO.populate();

	}

}
