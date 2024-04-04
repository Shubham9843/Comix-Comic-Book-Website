package com.comix.Comix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComixApplication.class, args);
		System.err.println("Comix Is Running Fine");
	}

}
