package com.project_module_iii.project_BookingCabMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class ProjectBookingCabMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBookingCabMsApplication.class, args);
	}

}
