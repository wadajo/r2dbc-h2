package com.graphql.r2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.graphql.r2dbc.repository")
public class R2dbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(R2dbcApplication.class, args);
	}

}
