package com.mostafayehia.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QuranCoach implements Coach {

	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	
	/*
	 * public QuranCoach(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		return "Read one Juzaa of Quran" ;
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}
