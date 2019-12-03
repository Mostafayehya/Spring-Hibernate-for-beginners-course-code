package com.mostafayehia.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService; 
	
	@Value("${mostafa.email}")
	private String email; 
	@Value("${mostafa.age}")
	private Integer age; 
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "swim for 15 minutes as fast as you can";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	public String getEmail() {
		return email;
	}
	public Integer getAge() {
		return age;
	}
	
	

}
