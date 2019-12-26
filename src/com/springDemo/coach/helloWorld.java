package com.springDemo.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getData() + coach.getInjector());
		context.close();
	}

}
