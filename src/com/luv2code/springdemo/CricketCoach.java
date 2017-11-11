package com.luv2code.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String team;
	private String email;
	
	public CricketCoach() {
		System.out.println("inside Constructor");
	}
	public void setTeam(String team) {
		System.out.println("set team");
		this.team = team;
	}

	public void setEmail(String email) {
		System.out.println("setting email:");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}
	
	public void setFortuneService(FortuneService fortuneService){
		System.out.println("inside set fortune service");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fielding for 30 mins and then batting for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	

}
