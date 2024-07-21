package com.metehan.ImageService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageServiceApplication.class, args);

		System.out.println("**********************************************************************");
		System.out.println("************* Server is started. Listening port 8080 ... *************");
		System.out.println("**********************************************************************");
	}

}
