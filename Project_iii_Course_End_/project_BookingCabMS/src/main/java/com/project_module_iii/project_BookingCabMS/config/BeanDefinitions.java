package com.project_module_iii.project_BookingCabMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanDefinitions {
		
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(); 
	}
	

}
