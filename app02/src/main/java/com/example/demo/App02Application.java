package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class App02Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(App02Application.class, args);
//	}
//
//}

@SpringBootApplication
public class App02Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(App02Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App02Application.class);
	}

}
