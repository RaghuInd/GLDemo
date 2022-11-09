package com.app.inhertitance;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Tv parent = new Tv();
		parent.display();
		
		ColorTV child =new ColorTV();
		child.display();
		//parent = child;
		Scanner scanner =new Scanner(System.in);
		System.out.println("1) B&W 2) Color");
		int choice =scanner.nextInt();
		Tv parentRef;
		if(choice ==1) {
			parentRef =parent;
		}
		else
		{
			parentRef = child;
		}
		parentRef.display();// Dynamic polymorphism
	
		
		//child =(Child)parent;
		//child.display();

	}

}
