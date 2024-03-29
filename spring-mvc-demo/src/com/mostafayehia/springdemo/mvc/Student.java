package com.mostafayehia.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

public class Student {
	
	private String firstName; 
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions; 
	private String favouriteLanguage;
	private String[] operatingSystems;
	
	public Student(){
		
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("EG","Egypt");
		countryOptions.put("BR","Brazil");
		countryOptions.put("US","United States of Amercia");
		countryOptions.put("EG","Egypt");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	
	


}
