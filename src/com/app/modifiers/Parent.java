package com.app.modifiers;

public class Parent {

	private Integer data=100;
	public String name ="GL";
	String email="info@gl.com";
	protected String pin="1234";
	private void display() {
		System.out.println(data+":"+email);
	}
	public void displayName() {
		System.out.println(name);
	}
	public void display2() {
		data=200;
		System.out.println(data);
		display();
	}
}
