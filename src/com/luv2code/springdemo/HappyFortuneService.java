package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Good luck with your game this weekend";
	}

}
