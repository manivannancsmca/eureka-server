package com.saga_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer          // ✅ This turns it into Eureka Server
public class SagaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagaEurekaApplication.class, args);
	}

}
