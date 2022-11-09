package com.app.modifiers;

public class Child extends Parent{
	
	public void display() {
		//super.data
		super.name= "New name";
		super.pin="456";
		super.displayName();
		System.out.println(super.email);
		//System.out.println(super.name);
	}

}
