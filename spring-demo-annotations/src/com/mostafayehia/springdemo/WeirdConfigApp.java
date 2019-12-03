package com.mostafayehia.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeirdConfigApp {
	
	@Bean
	public WeirdFortuneService weirdFortuneService() {
		return new WeirdFortuneService();
	}
	
	@Bean 
	public Coach weirdCoach() {
		return new  WeirdCoach(weirdFortuneService());
	}

}
