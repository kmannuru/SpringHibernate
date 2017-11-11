package com.luv2code.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	public TrackCoach(){}
	public TrackCoach(FortuneService fortuneSerivce){
		this.fortuneService = fortuneSerivce;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice 5K run with max speed";
	}
	
	@Override
	public String getDailyFortune(){
		return this.fortuneService.getFortune();
	}
}
