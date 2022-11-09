package com.app.interfaces;

public class Driver {

	public static void main(String[] args) {

		A a;
		a = new DemoImpl();
		a.display1();
		a.display2();
		//a.display3();
		B b;
		b = (B) a;
		b.display3();
		
		DemoImpl demoImpl;
		demoImpl = (DemoImpl) a;
		demoImpl.display1();
		demoImpl.display2();
		demoImpl.display3();
		client1(new DemoImpl());
		client2(new DemoImpl());
		client1(new DemoImpl2());
		A a1=new DemoImpl();// Loose coupling
		a1=new DemoImpl2();
		DemoImpl demoimpl1 = new DemoImpl(); // tight coupling
		//demoimpl1 = new DemoImpl2();
	//	B b2 = new DemoImpl2(); // class impl 2 is not a type of B
		
	}
	static void client1(A a) {
		a.display1();
	}
	static void client2(B b) {
		b.display3();
	}

}
