package com.spring.AutoWiring;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getDailyWorkOut() {
		System.out.println("swin daily for 1 hr :");
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
