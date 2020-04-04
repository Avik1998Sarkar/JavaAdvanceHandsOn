package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Employee emp() {
		return new Employee();
	}
	@Bean
	public Passport pass() {
		return new Passport();
	}
}
