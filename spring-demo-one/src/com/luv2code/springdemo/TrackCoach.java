package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkouot() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyMeals() {

		return "Have Milk after Dinner";
	}

}
