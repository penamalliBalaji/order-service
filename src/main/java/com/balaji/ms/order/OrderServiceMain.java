package com.balaji.ms.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceMain {

	public static void main(String[] args) {
		
		System.setProperty("spring.config.name", "order-service");
		SpringApplication.run(OrderServiceMain.class, args);

	}

}
