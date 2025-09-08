package io.github.microservices.customersmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomersmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersmicroserviceApplication.class, args);
        System.out.println("Customers Microservice Started");
	}

}
