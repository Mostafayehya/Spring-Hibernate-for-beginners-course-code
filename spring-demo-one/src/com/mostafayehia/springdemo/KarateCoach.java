package com.mostafayehia.springdemo;

public class KarateCoach implements Coach {



	private AdviceService adviceService;
	private String emailAdress; 
	private int phoneNumber;

	public KarateCoach() {
		System.out.println("KarateCoach: no args constructor is called");
	}

	public String getEmailAdress() {
		return emailAdress;
	}


	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAdviceService(AdviceService adviceService) {
		System.out.println("KarateCoach: adviceService setter is called");
		this.adviceService = adviceService;
	}

	@Override
	public String giveAdvice() {
		return adviceService.giveAdvice();
	}

}
