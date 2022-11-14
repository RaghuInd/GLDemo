package com.app.collections;

import java.util.Comparator;

// sort by salary

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.getSalary().compareTo(emp2.getSalary());
	}

}
