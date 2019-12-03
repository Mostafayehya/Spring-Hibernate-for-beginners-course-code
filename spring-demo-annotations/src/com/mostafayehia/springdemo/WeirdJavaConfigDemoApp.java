package com.mostafayehia.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WeirdJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(WeirdConfigApp.class);
		
		WeirdCoach coach = context.getBean("weirdCoach",WeirdCoach.class); 
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

	}

}
