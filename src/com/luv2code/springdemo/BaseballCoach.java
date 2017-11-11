package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneSerivce){
		this.fortuneService = fortuneSerivce;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice batting in cage for 1 hour";
	}
	
	@Override
	public String getDailyFortune(){
		return this.fortuneService.getFortune();
	}

}
