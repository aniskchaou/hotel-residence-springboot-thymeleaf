package com.dev.delta.dto;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.User;

public interface DTO {
   public User user=new  User();
   public InformationHotel informationHotel=new InformationHotel();

	public void populate();
}
