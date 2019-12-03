package com.mostafayehia.springdemo;

public class MyApp {

	public static void main(String[] args) {

		Coach coach = new SwimmingCoach();
		
		System.out.println(coach.getDailyWorkout());
	}

}
