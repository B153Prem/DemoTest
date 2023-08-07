package com.cjc.web.crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class WebServiceCrud3Application {

	public static void main(String[] args) {
		System.out.println("This is Web Service Crud 3");

		System.out.println("Pranali is an Buddu girl");

		System.out.println("Pranali is an intelligent girl");

		System.out.println("This is web modification to pranali");

		SpringApplication.run(WebServiceCrud3Application.class, args);
	}

}
