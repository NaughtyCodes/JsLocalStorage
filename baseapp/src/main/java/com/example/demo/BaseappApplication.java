package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class BaseappApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(BaseappApplication.class, args);
//		
////		SpringApplication app = new SpringApplication(BaseappApplication.class);
////		app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
////		app.run(args);
//	}
//
//}

@SpringBootApplication
public class BaseappApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(BaseappApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BaseappApplication.class);
	}

}

