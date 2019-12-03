package com.mostafayehia.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach",Coach.class);
		
		KarateCoach karateCoach = context.getBean("karateCoach",KarateCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.giveAdvice());
		
		System.out.println(karateCoach.getEmailAdress());
		
		System.out.println(karateCoach.getPhoneNumber());
		
		context.close();
		
		
	}

}
