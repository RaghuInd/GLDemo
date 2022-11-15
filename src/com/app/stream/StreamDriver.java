package com.app.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

import java.util.stream.Collectors;

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
		empNames.stream().map(n -> n.length()).forEach(name -> System.out.println(name));

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(5, "gg", 150.0));
		empList.add(new Employee(7, "aa", 50.0));
		empList.add(new Employee(1, "zz", 550.0));
		empList.stream().map(e -> e.getSalary()).forEach(id -> System.out.println(id));
		// hike sal by 10%
		Function<Employee, Employee> empSalHike = e -> {
			e.setSalary((e.getSalary() * 1.1));
			return e;
		};
		Consumer<Object> display = o -> System.out.println(o);

		empList.stream().map(empSalHike).forEach(display);
		// Filter
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(1);
		intList.add(0);
		intList.add(15);
		// get num < 10
		intList.stream().filter(n -> n < 10).forEach(display);
		// get names having len < 5 chars
		Integer maxLen = 5;
		empNames.stream().filter(n -> n.length() > maxLen).forEach(display);
		// get names of emp having sal > 100Rs
		System.out.println("Emp getting salary > 100");
		empList.stream().filter(e -> e.getSalary() > 100).map(e -> e.getName()).map(n -> n.toUpperCase())
				.forEach(display);
		// reduce
		// dum of all names length
		Optional<Integer> optSum = empNames.stream().map(s -> s.length()).reduce((a, b) -> a + b);
		if (optSum.isPresent())
			System.out.println(optSum.get());
		// get sum of all emp sal
		Optional<Double> optTotalSalary = empList.stream().map(e -> e.getSalary()).reduce((a, b) -> a + b);

		if (optTotalSalary.isPresent())
			System.out.println("Sum of all emp sal=" + optTotalSalary.get());
		else
			System.out.println("Total sal could not be found.");
		// limit(n)
		System.out.println("int list:" + intList);
		System.out.println("Limit to 2 elements:");
		intList.stream().limit(2).forEach(display);
		// skip(n)
		System.out.println("skip 2 elements:");

		intList.stream().skip(2).forEach(display);
		// max + min
		Optional<Integer> optMax = intList.stream().max((a, b) -> a.compareTo(b));
		if (optMax.isPresent())
			System.out.println("Max in list:" + optMax.get());
		Optional<Integer> optMin = intList.stream().min((a, b) -> a.compareTo(b));
		if (optMax.isPresent())
			System.out.println("Min in list:" + optMin.get());

		// sort
		System.out.println("int list in ASC order");
		intList.stream().sorted().forEach(display);
		System.out.println("int list:" + intList);

		System.out.println("Names list in ASC order");
		empNames.stream().sorted().forEach(display);
		System.out.println("names list:" + empNames);
		// sort emp by id
		System.out.println("emp list in ASC order by id");
		empList.stream().sorted().forEach(display);
		System.out.println("emp list:" + empList);
		// sort by salary
		System.out.println("Emp by sal");
		empList.stream().sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).forEach(display);
		// max sal
		System.out.println("Emp having min sal");
		empList.stream().sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).limit(1).forEach(display);
		// sort in DESC order
		System.out.println("Emp in DESC order");
		empList.stream().sorted((e1, e2) -> e2.getSalary().compareTo(e1.getSalary())).forEach(display);
		// sort in DESC order
		System.out.println("Emp in DESC order");
		Comparator<Employee> sortBySal = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());
		
		empList.stream().sorted(sortBySal.reversed()).forEach(display);

	}
}
