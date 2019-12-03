package com.mostafayehia.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Do 10 rounds around the field";
	}

	@Override
	public String giveAdvice() {
		return null;
	}

}
