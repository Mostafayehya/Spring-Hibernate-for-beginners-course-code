package com.mostafayehia.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.test.context.event.annotation.PrepareTestInstance;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TennisCoach implements Coach {

	@Autowired //Field injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	//Constructor injection
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(" >>Tennis Coach: doMyStartupStuff called");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">>Tennis coach: doMyCleanUpStuff called");
	}
	//Method injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService;
	 * 
	 * }
	 */
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "pracise hitting serve";
	}

	@Override
	public String getDailyFortune() {
		 	return fortuneService.getFortune();
	}


}
