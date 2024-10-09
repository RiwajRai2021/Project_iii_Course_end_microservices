package com.project_module_iii.project_CalculateFare.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class CalculateFareController {
	
//	@Value("${app.calculatefare}")
//	private String calculateFareGreeting; 


	@GetMapping("/calculateFare")
	public ResponseEntity<Double>calculateFare(@RequestParam String fromLocation, 
			@RequestParam String toLocation){
		
		//Calculate fare based on locations -- mimicking a SERVICE
		
		double fare = calculateFareBetweenLocations(fromLocation, toLocation); 
		
		//Return the fare in a ResponseEntity
		return new ResponseEntity<>(fare, HttpStatus.OK);
		
	}
	
	private double calculateFareBetweenLocations(String fromLocation, String toLocation) {
		//Example calculation logic
		//Here you can implement your fare calculation based on locations
		//For simplicity, let's assume a fixed rate and distance
		double baseFare = 5.0; //base fare 
		double perMileRate = 1.5; //rate per mile
		double distance = getDistance(fromLocation, toLocation); //Assume this method calculates the distance from fromLocation to toLocation) 
		
		return baseFare + (perMileRate * distance); 
	}
	
	private double getDistance(String fromLocation, String toLocation) {
		//placeholder for distance calculation logic 
		//for now, lets return a dummy distance
		return 10.0; //assume a fixed distance of miles  for demonstration
		
		
	}

}

	
