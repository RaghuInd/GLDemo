package com.app.interfaces.features;

public interface A {
	public final static Float PI=3.14F;
	
	static void funOne() {// utility methods
		System.out.println("Int A Fun 1");
	}
	default void funTwo() {
		System.out.println("A : funTwo()");
	}

	public abstract void funThree();//abstract method
}
