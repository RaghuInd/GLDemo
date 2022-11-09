package com.app.interfaces.features;

public class Demo implements A {

	public void disp() {
		A.funOne();
	}
	
	static void funOne() {// utility methods
		System.out.println("Demo Fun 1");
	}
	@Override
	public void funThree() {
		System.out.println("fun3");
		
	}
	public void funTwo() {
		System.out.println("Demo : funTwo()");
	}
	
}
