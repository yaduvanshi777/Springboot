package com.example.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneApplication {
	/**
			* Main method that runs the Spring Boot application.
			*
			* @param args the command line arguments
    */

	public static void main(String[] args) {
		ConfigurableApplicationContext  context = SpringApplication.run(OneApplication.class, args);

		Alien app = context.getBean(Alien.class);
		app.show();

		Alien app1 = context.getBean(Alien.class);
		app1.show();

//		System.out.println("welcome .. testing");
	}

}
