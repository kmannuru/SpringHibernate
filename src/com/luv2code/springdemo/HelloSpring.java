package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println("Today's workout is = "+myCoach.getDailyWorkout());
		
		context.close();

	}

}
