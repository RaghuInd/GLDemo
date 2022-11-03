package com.app;


public class SearachDemo { // ctrl+shift+F : format
	public static Integer binarySearch(Integer[] values, Integer key) {
		Integer low = 0, high = values.length;
		Integer mid = -1;

		while (high >= low) {
			mid = (low + high) / 2;
			if (values[mid] == key)
				return mid;

			if (key > values[mid])
				low = mid + 1;

			else
				high = mid - 1;

		}

		return mid;
	}
	

}
