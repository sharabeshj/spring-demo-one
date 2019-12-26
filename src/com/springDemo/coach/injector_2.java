package com.springDemo.coach;

import java.util.Random;

public class injector_2 implements injectorTest {

	@Override
	public String getInjector() {
		// TODO Auto-generated method stub
		String[] choices = {"first","second","third"};
		Random r = new Random();
		int rn = r.nextInt(choices.length);
		return choices[rn];
	}

}
