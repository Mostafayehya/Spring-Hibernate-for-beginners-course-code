package com.mostafayehia.springdemo;

public class SwimmingCoach implements Coach {

	private AdviceService mAdviceService;

	public SwimmingCoach() {
	}

	public SwimmingCoach(AdviceService trainingAdviceService) {
		mAdviceService = trainingAdviceService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim for 30 minutes";
	}

	@Override
	public String giveAdvice() {
		return mAdviceService.giveAdvice();
	}
	
	public void initMethod() {
		System.out.println("init method is called");
	}
	
	public void destroyMethod() {
		System.out.println("destroy method is called");
	}

}
