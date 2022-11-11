package com.app.statics;

public class Demo {
	public static Integer data = 100;// static data member
	public Integer value = 200;// instance data member

	public void display() { // instance method i.e available by creating new object
		System.out.println("static data:" + data + " Value:" + value);
		// display2();
	}

	public static void display2() {// belongs to class , no need of object of Demo
	
		int j =100;
		
		System.out.println("static data:" + data + " Value:?");// +value);
		// display();
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		Demo.data = data;
	}

}
