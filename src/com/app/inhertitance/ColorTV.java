package com.app.inhertitance;

public class ColorTV extends Tv {

	String name="GL";
	public void display() {
		System.out.println("Color  : display()");
	}

	
	public ColorTV() {
		super();
		
	}


	public void display2() {
		System.out.println("Child : display2()");
	}

}
