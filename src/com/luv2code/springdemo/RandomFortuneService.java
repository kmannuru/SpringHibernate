package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes;
	//static final String[] fortunes = {"Good luck is on your way", "You've get a reward soon","You've a great confidence", "your skills will take you to next level"};
	
	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortunes[new Random().nextInt(fortunes.length)];
	}

}
