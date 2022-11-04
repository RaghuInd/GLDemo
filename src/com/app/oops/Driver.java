package com.app.oops;

public class Driver {

	public static void main(String[] args) {
		
		float f =100.0f;
		int i = 10;
		Integer data =100;
		
		
		Employee employee = new Employee(1,"GL",25000.0);
		System.out.println(employee);
		System.out.println(employee.toString());
		Employee employee2 = new Employee(2,"GL2",35000.0);
		System.out.println(employee2);
		employee2.setName("New GL2");
		System.out.println(employee2);
		//employee2=null;// null is literal
		//employee2=employee;
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println("emp1 salary:"+employee.getSalary());
		
		int [] intArray = new int[10];
		Integer [] integerArray = new Integer[10];
		
		Employee [] employees = new Employee[10];
		employees[0] = new Employee(3, "name 3", 300.0);
		employees[1] = new Employee(4, "name 4", 400.0);
		System.out.println(employees[0]);
		System.out.println(employees[1]);
		employees[1].setName("new name 4");
		System.out.println(employees[1]);
		
		for(Employee empRef:employees) {
			System.out.println(empRef);
		}
	}

}
