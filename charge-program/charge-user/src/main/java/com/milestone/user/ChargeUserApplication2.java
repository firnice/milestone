package com.milestone.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChargeUserApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(ChargeUserApplication2.class, args);
	}
}
