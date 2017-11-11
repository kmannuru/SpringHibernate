package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println("Today's workout is = "+myCoach.getDailyWorkout());
		System.out.println("Fortune for today is : "+myCoach.getDailyFortune());
		
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		CricketCoach newCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println("-----Cricket Coach------");
		System.out.println("Today's workout is = "+myCricketCoach.getDailyWorkout());
		System.out.println("Fortune for today is : "+myCricketCoach.getDailyFortune());
		//System.out.println("Team : "+myCricketCoac);
		System.out.println("email : "+myCricketCoach.getEmail()+ " ----Team Name :"+myCricketCoach.getTeam());
		
		if(myCricketCoach == newCricketCoach) {
			System.out.println("both objects are equal");
		}
		
		System.out.println(myCricketCoach);
		System.out.println(newCricketCoach);
		context.close();

	}

}
