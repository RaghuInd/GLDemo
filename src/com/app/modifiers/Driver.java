package com.app.modifiers;

public class Driver {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		System.out.println(parent.hashCode());
		parent.name="new GL";
		parent.displayName();
		Child child =new Child();
		child.display();
		parent.email="hi@gl.com";
		parent.pin="888";
	}

}
