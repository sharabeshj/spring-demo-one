package com.springDemo.coach;

public class BasketBallCoach implements Coach {
	
	private injectorTest injector;
	
	public BasketBallCoach() {
		System.out.println("default");
	}
	
	public BasketBallCoach(injectorTest injector) {
		this.injector = injector;
	}
	@Override
	public String getData() {
		return "Run 10 straights ";
	}
	@Override
	public String getInjector() {
		return this.injector.getInjector();
	}
}
