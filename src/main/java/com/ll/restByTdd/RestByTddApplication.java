package com.ll.restByTdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestByTddApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestByTddApplication.class, args);
	}

}
