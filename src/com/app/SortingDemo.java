package com.app;

public class SortingDemo {

	public static void insertionSort(Integer[] values) {

		for (int i = 1; i < values.length; i++) {
			int key = values[i];
			int j = i - 1;

			while (j >= 0 && values[j] > key) {// right shift array elements 
				values[j + 1] = values[j];
				j--;
			}
			values[j+1]=key;

		}
	}
}
