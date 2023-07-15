package com.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicCatalogApplication {

	public static void main(String[] args) {
		System.out.println(System.getenv("PGHOST"));
		SpringApplication.run(MusicCatalogApplication.class, args);
	}

}
