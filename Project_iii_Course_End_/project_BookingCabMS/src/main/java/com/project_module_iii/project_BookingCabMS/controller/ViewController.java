package com.project_module_iii.project_BookingCabMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // for views 
public class ViewController {
	
	@GetMapping("/greeting")
	public String greeting() {
		
		return "redirect:/greeting.html"; 
	}
	
	

}
