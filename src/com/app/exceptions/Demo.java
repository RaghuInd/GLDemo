package com.app.exceptions;

public class Demo {
	void a() {
		b();
		// try {
//		b();
//	}
//	catch (ArithmeticException e) {
//		System.out.println(e.getMessage());
//	}
	}

	void b() {
		int i = 10 / 0;
//		try {
//			int i=10/0;
//		}
//		catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}

	}
}
