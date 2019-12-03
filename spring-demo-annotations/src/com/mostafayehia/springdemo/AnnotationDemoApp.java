package com.mostafayehia.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file 

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		//read beans from config file 
		
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class); 
		
		Coach quranCoach = context.getBean("quranCoach",Coach.class); 

		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(quranCoach.getDailyWorkout());
		
		System.out.println("tennis fortune: "+ tennisCoach.getDailyFortune());
		
		System.out.println("quran fortune: "+ quranCoach.getDailyFortune());

		//close the container
		
		context.close();
	}

}
