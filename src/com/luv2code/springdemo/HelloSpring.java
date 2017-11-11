package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println("Today's workout is = "+myCoach.getDailyWorkout());
		System.out.println("Fortune for today is : "+myCoach.getDailyFortune());
		
		Coach myCricketCoach = context.getBean("myCricketCoach", Coach.class);
		System.out.println("-----Cricket Coach------");
		System.out.println("Today's workout is = "+myCricketCoach.getDailyWorkout());
		System.out.println("Fortune for today is : "+myCricketCoach.getDailyFortune());
		//System.out.println("Team : "+myCricketCoac);
		
		context.close();

	}

}
