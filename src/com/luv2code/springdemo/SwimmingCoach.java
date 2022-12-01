package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {
	
	//define dependency
	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService newFortuneService) {
		this.fortuneService = newFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 10 laps";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
