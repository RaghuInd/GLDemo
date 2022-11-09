package com.app.oops.polymorphism;

public class Demo {

	//3 ways to change the signature of method
	//1. By data type
	//2. By number of arguments
	//3. By order of parameter data types
	public void display() {
		System.out.println("display()");
	}

	public void display(int data) {
		System.out.println("display(int):"+data);
	}
	public void display(double data) {
		System.out.println("display(int):"+data);
	}
	public void display(String data) {
		System.out.println("display(int):"+data);
	}
	public void display(String data,int value) {
		System.out.println("display(String:int):"+data+":"+value);
	}
	public void display(int value,String data) {
		System.out.println("display(int:String):"+value+":"+data);
	}

	public void display(String data,int value,double info) {
		System.out.println("display(int):"+data);
	}
}
