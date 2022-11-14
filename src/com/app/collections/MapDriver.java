package com.app.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDriver {

	public static void main(String[] args) {

		// Hash map features
		// 1. No order
		// 2. no duplicate keys
		// 3. duplicate values allowed
		// 4. Multiple null values
		// 5. single null key

		// Create
		Map<String, Integer> cityPincodeMap = new HashMap<>();

		cityPincodeMap.put("city1", 111);
		cityPincodeMap.put("city2", 111);
		cityPincodeMap.put("city3", 333);
		// cityPincodeMap.put("city1", 555);
		cityPincodeMap.put("city4", null);
		cityPincodeMap.put("city5", null);
		cityPincodeMap.put(null, null);
		System.out.println(cityPincodeMap);
		cityPincodeMap.put(null, 999);
		System.out.println(cityPincodeMap);
		System.out.println("key set:" + cityPincodeMap.keySet());
		System.out.println("map list of values set:" + cityPincodeMap.values());
		// Read

		System.out.println("map contains key city3?:" + cityPincodeMap.containsKey("city3"));
		System.out.println("pincode of city3:" + cityPincodeMap.get("city3"));
		System.out.println("map contains value 111?:" + cityPincodeMap.containsValue(111));
		// Update
		cityPincodeMap.put("city4", 444);// do not use put to update
		System.out.println("city map:" + cityPincodeMap);

		cityPincodeMap.replace("city9", 999);
		System.out.println("city map:" + cityPincodeMap);
		cityPincodeMap.replace("city5", null, 555);
		System.out.println("city map:" + cityPincodeMap);

		for (Map.Entry<String, Integer> entry : cityPincodeMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		// convert given em p list to map?

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(5, "gg", 150.0));
		empList.add(new Employee(7, "aa", 450.0));
		empList.add(new Employee(1, "zz", 50.0));
		System.out.println(empList);
		// Create
		Map<Integer, Employee> empMap = new HashMap<>();
		empMap.put(3, new Employee(3, "name3", 300.0));
		empMap.put(1, new Employee(1, "name1", 100.0));
		empMap.put(2, new Employee(2, "name2", 200.0));
		System.out.println(empMap);
		// Read
		System.out.println("emp id 1:" + empMap.get(1));

		System.out.println("emp id 3:" + empMap.get(3));
		// Update
		empMap.replace(2, new Employee(2, "new name 2", 220.0));
		System.out.println(empMap);
		//Delete
		empMap.remove(2);
		System.out.println("after rem of id 2:"+empMap);

	}

}
