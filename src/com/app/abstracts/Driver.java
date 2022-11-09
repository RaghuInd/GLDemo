package com.app.abstracts;

public class Driver {

	public static void main(String[] args) {
		
		
		Demo demo;
		//demo = new Demo();
		//demo = new FutureDemo();
		demo = new ChildFutureDemo();
		demo.display();
		//demo.display2();
		ChildFutureDemo childRef;
		childRef = (ChildFutureDemo) demo;
		childRef.display2();
		
	}

}
