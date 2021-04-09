package com.lti.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.lti"})
@EntityScan(basePackages = "com.lti")
public class VehicleInsuranceJarApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleInsuranceJarApplication.class, args);
	}

}
