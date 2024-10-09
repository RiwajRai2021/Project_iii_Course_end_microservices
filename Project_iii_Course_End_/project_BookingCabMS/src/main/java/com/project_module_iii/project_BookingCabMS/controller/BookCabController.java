package com.project_module_iii.project_BookingCabMS.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project_module_iii.project_BookingCabMS.config.FeignService;
import com.project_module_iii.project_BookingCabMS.model.Cab;
import com.project_module_iii.project_BookingCabMS.service.CabService;

@RestController
@Configuration
@RequestMapping(path="cab")
public class BookCabController {
	
	//fields (autowired fields)
	
	@Value("${app.greeting}")
	private String testGreeting; 
	
//	@Value("${app.calculatefare}")
//	private String calculateFareGreeting; 
//	
	@Autowired
	private RestTemplate restTemplate; 
	
	@Autowired
	private FeignService feignService; 
	
	@Autowired
	private CabService cabService; 
	
	
	//methods (handler methods that return a response to the caller
	
//	@GetMapping("/index")
//	public String Home() {
//		
//		return "index.html"; 
//		
//	}
//	
	@PostMapping("/add")
	public String addBookedCab(@RequestParam String FromLocation, @RequestParam String ToLocation, @RequestParam Integer TypeOfCab) {
		
		
		Cab cab = new Cab(1,FromLocation,ToLocation,TypeOfCab, 50.0);
		
		
		return null;
		
		
	}

	//High level recommendation
	@PostMapping("/addtwo")
	public ResponseEntity<Cab> addBookedCabTwo(@RequestBody Cab cab) {
		
		//reach out to the Calculate Fare Service, to calculate the Fare internally. 
//		 String url = "http://locahost:8084/calculateFare";  
		
//		String url = "http://project_CalculateFare/calculateFare"; 

			// Build the URL with query parameters
//			 String uri = UriComponentsBuilder.fromHttpUrl(url)
//		                .queryParam("fromLocation", cab.getFromLocation())
//		                .queryParam("toLocation", cab.getToLocation())
//		                .toUriString();

			//Create an HttpEntity to hold any request headers (if needed) 
			// HttpEntity<Double>entity = new HttpEntity<>(null); 
			 
			 
			 //Exchange method t o perform the GET request
			// ResponseEntity<Double>response=restTemplate.exchange(uri, HttpMethod.GET, entity, Double.class); 
			 
			 ResponseEntity<Double> calcFareResponse =feignService.calculateFare(cab.getFromLocation(),cab.getToLocation()); 
			 
			 
			 Double calculatedFare = calcFareResponse.getBody(); 
			 
			 //Add that fare we get back, to our CAB OBJECT that we received. 
			 cab.setRate(calculatedFare); 
			 
			 
			 //Sending the cab object to the DB, then returning the successful send to the client with 
			 //extra information detailing the Fare Price. 
			 
			 //redirect to a new page? --serving web content 
			 
			 Cab cabBookedToDB = cabService.bookCab(cab); 
			 
			 //send JSON back to FRONT END, which can do whatever you want with it 
			//System.out.println("testing!:" + testGreeting);
			
			
					
		return ResponseEntity.status(HttpStatus.CREATED).body(cabBookedToDB); 		
	}

}
