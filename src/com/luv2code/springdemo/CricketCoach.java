package com.luv2code.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String team;
	private String email;
	
	public void setTeam(String team) {
		this.team = team;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFortuneService(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fielding for 30 mins and then batting for 1 hour";
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}
	

}
