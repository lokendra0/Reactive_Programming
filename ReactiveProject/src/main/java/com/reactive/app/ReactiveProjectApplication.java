package com.reactive.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication	
public class ReactiveProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveProjectApplication.class, args);
	}

}
