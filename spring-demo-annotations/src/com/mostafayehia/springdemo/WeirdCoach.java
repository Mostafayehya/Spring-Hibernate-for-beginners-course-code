package com.mostafayehia.springdemo;

public class WeirdCoach implements Coach {

	
	private FortuneService fortuneService; 
	
	public  WeirdCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Do a Weird workout ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
