package com.app.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDriver {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		// Features
		// 1. in order
		// 2. not sorted
		// 3. Aloows duplicates

		intList.add(6);
		intList.add(5);
		intList.add(1);
		intList.add(6);
		System.out.println(intList);
		// Set features
		// 1. No order
		// 2. not sorted
		// create
		Set<Integer> intSet = new HashSet<>();
		intSet.add(8);
		intSet.add(1);
		intSet.add(11);
		intSet.add(-8);
		System.out.println("Add -8:" + intSet.add(-8));
		System.out.println("int set:" + intSet);
		// Read
		for (Integer data : intSet) {
			System.out.println(data);
		}
		// add list to set
		intSet.addAll(intList);
		System.out.println("after concatinating set with list:" + intSet);
		// Update
		for (Integer data : intSet) {
			if (data == 5)
				data = 25;// can't update data
		}
		System.out.println("int set:"+intSet);

		// Delete
		intSet.remove(-8);
		System.out.println("After deletion int set:"+intSet);
		Set<String> nameSet = new HashSet<>();
		nameSet.add("jjj");
		nameSet.add("sss");
		nameSet.add("qqq");
		nameSet.add("qqq");
		
		System.out.println("name set"+nameSet);
		// Employee set
		Set<Employee> empSet = new HashSet<>();

		empSet.add(new Employee(5, "gg", 50.0));
		empSet.add(new Employee(7, "aa", 250.0));
		empSet.add(new Employee(1, "zz", 450.0));
		empSet.add(new Employee(1, "zz", 450.0));
		System.out.println("emp set:"+empSet);
		List<Employee> empList = new ArrayList<>(empSet);
		empList.add(new Employee(7, "aa", 250.0));
		
		System.out.println("emp list:"+empList);
		Set<Employee> empSet2 = new HashSet<>(empList);
		System.out.println("Emp set2:"+empSet2);
		empList.addAll(empSet2);
		// sorting
		//Collections.sort(empSet);
		SortedSet<Employee> sortedEmpSet = new TreeSet<Employee>(empSet);
		System.out.println(sortedEmpSet);
		Set<Employee> orderedEmpSet = new LinkedHashSet<>();
		orderedEmpSet.add(new Employee(5, "gg", 50.0));
		orderedEmpSet.add(new Employee(7, "aa", 250.0));
		orderedEmpSet.add(new Employee(1, "zz", 450.0));
		orderedEmpSet.add(new Employee(1, "zz", 450.0));
		System.out.println("ordered emp set:"+orderedEmpSet);
		
		
	}

}
