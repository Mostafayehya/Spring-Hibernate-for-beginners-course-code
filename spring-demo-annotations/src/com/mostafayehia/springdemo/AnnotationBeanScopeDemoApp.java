
package com.mostafayehia.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring container
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container 
		
		Coach coach = 
				context.getBean("tennisCoach",Coach.class); 
		
		Coach coachTwo = 
				context.getBean("tennisCoach", Coach.class); 
		
		System.out.println("Pointning to the same object: " + (coach ==coachTwo));
		
		System.out.println("Memory location for coach" + coach);
		
		System.out.println("Memory location for coachTwo" + coachTwo);
		

		context.close(); 
		
		
		

	}

}
