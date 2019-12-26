package com.springDemo.coach;

public class BasketBallCoach implements Coach {
	
	private injectorTest injector1,injector2;
	private String username, password;
	
	public BasketBallCoach() {
		System.out.println("default");
	}
	
	public BasketBallCoach(injectorTest injector) {
		this.injector1 = injector;
	}
	
	@Override
	public String getData() {
		return "Run 10 straights ";
	}
	public void setInjectorTest(injectorTest injector) {
		this.injector2 = injector;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	@Override
	public String getInjector1() {
		return this.injector1.getInjector();
	}
	
	@Override
	public String getInjector2() {
		return this.injector2.getInjector();
	}
}
