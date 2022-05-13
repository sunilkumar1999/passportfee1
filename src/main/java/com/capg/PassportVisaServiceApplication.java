package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PassportVisaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassportVisaServiceApplication.class, args);
	}

}
