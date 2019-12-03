package com.mostafayehia.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("bean-scope_application-context.xml");
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class); 
		
		Coach betaCoach = context.getBean("myCoach",Coach.class); 
		
		boolean isDifferentObjects = (alphaCoach==betaCoach);
		
		System.out.println(isDifferentObjects);
		
		context.close();

	}

}
