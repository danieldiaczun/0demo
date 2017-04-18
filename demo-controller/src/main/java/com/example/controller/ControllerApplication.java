package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.model"})
//@PropertySource({"classpath:application.properties", "classpath:sql-server.properties"})
@PropertySource({"classpath:application.properties", "classpath:h2.properties"})
@ComponentScan(basePackages = {"com.example"})
public class ControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerApplication.class, args);
	}
}