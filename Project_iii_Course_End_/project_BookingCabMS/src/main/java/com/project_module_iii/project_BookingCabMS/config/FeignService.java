package com.project_module_iii.project_BookingCabMS.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="PROJECTCALCULATEFARE", url = "http://localhost:9000")
public interface FeignService { 
	
	@GetMapping("/calculateFare")
	ResponseEntity<Double>calculateFare(@RequestParam String fromLocation, 
			@RequestParam String toLocation);

}
