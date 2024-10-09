package com.project_module_iii.project_BookingCabMS.controller;

import org.junit.jupiter.api.Test;

import com.project_module_iii.project_BookingCabMS.model.Booking;

public class BookinCabController {
	
	//fields
	private BookCabController bookingCabController = new BookCabController();
	
	@Test
	public void testBookCab() {
		
		Booking booking = new Booking(5,20,null);
		Booking expectedBooking = new Booking(5,20,100.0); 
		
		
		
	}

}
