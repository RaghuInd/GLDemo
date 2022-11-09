package com.app.interfacee;

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
	}
	static void client1(A a) {
		a.display1();
	}
	static void client2(B b) {
		b.display3();
	}

}
