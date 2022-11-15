package com.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.app.collections.Employee;

public class StreamDriver {

	public static void main(String[] args) {

		List<String> empNames = new ArrayList<>();
		empNames.add("Kabeer");
		empNames.add("Akshar");
		empNames.add("Gaurav");
		empNames.add("Sagar");
		System.out.println(empNames);
		// 1. create stream source
		// map function
		empNames.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		List<String> upperCaseNames = empNames.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames);
		empNames.stream().map(n->n.length()).forEach(name -> System.out.println(name));
		
		List<Employee> empList =new ArrayList<>();
		empList.add(new Employee(5, "gg", 150.0));
		empList.add(new Employee(7, "aa", 450.0));
		empList.add(new Employee(1, "zz", 50.0));
		empList.stream().map(e->e.getSalary()).forEach(id -> System.out.println(id));
		//hike sal by 10%
		Function<Employee,Employee> empSalHike = e->{e.setSalary((e.getSalary()*1.1));return e;};
		Consumer<Object> display = o -> System.out.println(o);
		
		empList.stream().map(empSalHike).forEach(display);
		// Filter
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(1);
		intList.add(0);
		intList.add(15);
		// get num < 10
		intList.stream().filter(n->n<10).forEach(display);
		//get names having len < 5 chars
		Integer maxLen = 5;
		empNames.stream().filter(n->n.length()>maxLen).forEach(display);
		//get names of emp having sal > 100Rs
		System.out.println("Emp getting salary > 100");
		empList.stream().filter(e->e.getSalary()>100).map(e->e.getName()).map(n->n.toUpperCase()).forEach(display);
		
		
		
		}
}


