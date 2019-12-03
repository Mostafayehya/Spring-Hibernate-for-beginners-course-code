package com.mostafayehia.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config file 

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		//read beans from config file 
		
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class); 
		
		System.out.println(swimCoach.getDailyWorkout());
	
		
		System.out.println("swimCoach fortune: "+ swimCoach.getDailyFortune());
		
		System.out.println("swimCoach email: "+swimCoach.getEmail());
		
		System.out.println("swimCoach age:  "+swimCoach.getAge());

		
		//close the container
		
		context.close();
	}

}
