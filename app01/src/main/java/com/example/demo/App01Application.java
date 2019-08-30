package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class App01Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(App01Application.class, args);
//	}
//
//}

@SpringBootApplication
public class App01Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(App01Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App01Application.class);
	}

}

