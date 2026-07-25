package com.example.crudSpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class CrudSpringDemoApplication {

	public static void main(String[] args) {


		SpringApplication.run(CrudSpringDemoApplication.class, args);
		System.out.println("Application Started");
	}

}
