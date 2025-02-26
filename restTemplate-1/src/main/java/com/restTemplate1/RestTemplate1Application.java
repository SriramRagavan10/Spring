package com.restTemplate1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplate1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplate1Application.class, args);
	}

	@Bean
	RestTemplate rest() {
		return new RestTemplate();
	}

}
