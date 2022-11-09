package com.app.finals;

public class Driver {

	public static void main(String args []) {

		int i = 100;
		i = 2000;// re assign new value
		final int j = 50;
		// j=55;
		final int k;// define what's k?
		k = 70;// assign
		// k=5;// re assign
		final Integer ii = 100;
		// ii=200;
		final Employee emp;// declare
		emp = new Employee(1, "gl", 25000.0);// assign
		emp.setName("new gl");
		System.out.println(emp);

		 //emp = new Employee(2,"gl2",35000.0);//re assign
		System.out.println(emp);

	}

}
