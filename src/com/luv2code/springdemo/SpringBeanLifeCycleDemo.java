package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println("-----Cricket Coach------");
		System.out.println("Today's workout is = "+myCricketCoach.getDailyWorkout());
		System.out.println("Fortune for today is : "+myCricketCoach.getDailyFortune());
		//System.out.println("Team : "+myCricketCoac);
		System.out.println("email : "+myCricketCoach.getEmail()+ " ----Team Name :"+myCricketCoach.getTeam());
		context.close();

	}

}
