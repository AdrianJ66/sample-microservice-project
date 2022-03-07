package com.samplemicroserviceproject.radioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RadioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadioServiceApplication.class, args);
	}

}
