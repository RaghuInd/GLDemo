package com.app.staticc;

public class Driver {

	 String name ="GL";
	
	public static void main(String[] args) {
		
		int j = 100;// local variables
		
		System.out.println(Demo.data);
		Demo demo = new Demo();
		System.out.println(demo.value);
		Demo.display2();
		demo.display();
		//name="hi";
		//System.out.println(name);
		Demo demo2 = new Demo();
		demo.setData(99);
		demo.display();
		demo2.display();
		demo2.setData(999);
		demo.display();
		

	}

}
