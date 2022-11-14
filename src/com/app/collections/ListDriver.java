package com.app.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDriver {

	public static void main(String[] args) {
		
		
		Collection<Integer> intCollection = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		//Features
		//1. in order
		//2. not sorted
		//3. Aloows duplicates
		
		intList.add(6);
		intList.add(5);
		intList.add(1);
		intList.add(6);
		
		System.out.println(intList);
		
		// CRUD
		// C create R read U update D delete
		List<String> nameList = new ArrayList<>();
		nameList.add("kk");
		nameList.add("aa");
		nameList.add("ff");
		System.out.println(nameList);
		// Read
		System.out.println(intList.get(0));
		int index=4;
		if(index != intList.size())
		System.out.println(intList.get(index));
		System.out.println("For loop:");
		for(int i=0;i<intList.size();i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("For each:");
		for(Integer ele:intList) {
			System.out.println(ele);
		}
		System.out.println("index of 5:"+intList.indexOf(5));
		System.out.println("index of 6:"+intList.indexOf(6));
		System.out.println("last index of 6:"+intList.lastIndexOf(6));
		
		// Update
		intList.add(9);
		System.out.println(intList);
		intList.add(3,8);
		System.out.println(intList);
		intList.set(3, 7);
		System.out.println(intList);
		// Delete
		
		intList.remove(2);
		System.out.println("after removing element at index 2:");
		System.out.println(intList);
		Integer element = 9;
		System.out.println("Remove 9:"+intList.remove(element));
		System.out.println("after removing element 9:");
		System.out.println(intList);
		//List<int> intList= new ArrayList<>();
		// Add all
		List<Integer> secondList = new ArrayList<>();
		secondList.add(202);
		secondList.add(210);
		secondList.add(207);
		System.out.println("2nd list:"+secondList);
		intList.addAll(secondList);
		System.out.println("After adding 1st and 2nd list:"+intList);
		//remove all
		intList.removeAll(secondList);
		System.out.println("After removing  2nd list from 1st list:"+intList);
		//intList.removeAll(null);
		//retain all
		intList.retainAll(secondList);
		System.out.println("retial all from 2nd list:"+intList);
		
		
		Collections.sort(intList);
		System.out.println("sorted intlist:"+intList);
		
		Collections.sort(nameList);
		System.out.println("sorted name list:"+nameList);
		
		// User defined data type
		// Create
		List<Employee> empList =new ArrayList<>();
		empList.add(new Employee(5, "gg", 150.0));
		empList.add(new Employee(7, "aa", 450.0));
		empList.add(new Employee(1, "zz", 50.0));
		System.out.println(empList);
		Employee newEmp = new Employee(3, "ff", 750.0);
		
		empList.add(1,newEmp);
		System.out.println(empList);
		//Read
		System.out.println("emp at index 1:"+empList.get(1));
		System.out.println("is my list contains emp 3?:"+empList.contains(newEmp));
		Employee newEmp3 = new Employee(3, "ff", 750.0);
		System.out.println("is my list contains emp 3?:"+empList.contains(newEmp3));
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		//update
		
		Employee updateEmp3 = new Employee(3, "ii", 770.0);
		Integer updateIndex=empList.indexOf(updateEmp3);
		
		empList.set(updateIndex, updateEmp3);
		System.out.println("After update of emp 3");
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		//Delete
		System.out.println("Delete emp at index 2");
		empList.remove(2);
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		System.out.println("Delete emp 3");
		Employee deleteEmp3 = new Employee(3, "ii", 770.0);
		
		empList.remove(deleteEmp3);
		for(Employee emp:empList) {
			System.out.println(emp);
		}

		// sorting emp by id by comparable
		empList.clear();
		
		empList.add(new Employee(5, "gg", 50.0));
		empList.add(new Employee(7, "aa", 250.0));
		empList.add(new Employee(1, "zz", 450.0));
		
		Collections.sort(empList);
		System.out.println("emp by id:"+empList);
		// sort emp by salary
		empList.sort(new EmployeeSalaryComparator());
		System.out.println("emp by salary:"+empList);
		
		// sort by name using lambda
		empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("Emp list by name:"+empList);
	}

}
