package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("/mailIntegration.xml")
public class DemoIntegrationApplication {
	
	

	public static void main(String[] args) {		
		SpringApplication.run(DemoIntegrationApplication.class, args);
	}
}
