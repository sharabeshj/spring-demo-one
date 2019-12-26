package com.springDemo.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scope_lifecycles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope_lfcycle_applicationContext.xml");
		BasketBallCoach coach_1 = context.getBean("myCoach", BasketBallCoach.class);
		BasketBallCoach coach_2 = context.getBean("myCoach", BasketBallCoach.class);
		System.out.println(coach_1.getData() + coach_1.getUsername() + coach_1.getPassword());
		boolean q = (coach_1==coach_2);
		System.out.println(q);
		System.out.println(coach_1);
		System.out.println(coach_2);
		context.close();
	}

}
