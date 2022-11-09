package com.app.modifiers2;

import com.app.modifiers.Parent;

public class Driver {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.name="Hello !";
		//parent.pin="000";// protected
		//parent.email="new@gl.com";
		Child child = new Child();
		//child.email="new";// not visible as its package potected
		
	}

}
