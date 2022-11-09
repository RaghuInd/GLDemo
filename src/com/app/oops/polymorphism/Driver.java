package com.app.oops.polymorphism;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo demo =new Demo();
		demo.display();
		demo.display(10);
		demo.display(10.5);
		demo.display("Gobal Logic");
		demo.display("India", 22);
		demo.display(22, "India");
	}

}
