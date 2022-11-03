package com.app;

public class Demo {

	public static void main(String[] args) {
		
		//int,float,byte,double,short,boolean,char,long
		int [] intArray = new int[100];
		float[] floatArray = new float[100];
		Integer [] integerArray = new Integer[100];
		Double [] doubleArray = new Double[100];
		String [] nameArray = new String[100];
		int data;
		//int dat2=data;
		for(int i=0;i<10;i++) {
			System.out.println(integerArray[i]);
			System.out.println(intArray[i]);
			System.out.println(floatArray[i]);
			//System.out.println(data);
		}
		Integer [] unSortedDataArray = {5,2,8,34,9};
		Integer [] sorteDataArray = {5,6,8,34,99};
		int foundIndex=SearachDemo.binarySearch(sorteDataArray, 34);
		if(foundIndex>=0)
			System.out.println("Element found by binarySearch at index:"+foundIndex);
		else
			System.out.println("Element not found by binarySearch" );
			
		Integer key = 5;
		int i=0;
		for(;i<unSortedDataArray.length;i++) {
//			String name= "GL";
//			System.out.println(name);
			if(unSortedDataArray[i]==key)
			{
				System.out.println("Key is found at location index:"+i);
				break;
			}
			
		}
		if(i==unSortedDataArray.length)
			System.out.println("Key not found");
		System.out.println();
	System.out.println("Before Insertion Sort / Card soting:");
	
	for(Integer element:unSortedDataArray) {
		System.out.print(element + " ");
	}
	SortingDemo.insertionSort(unSortedDataArray);
	System.out.println();
	System.out.println("After Insertion Sort / Card soting:");
	
	for(Integer element:unSortedDataArray) {
		System.out.print(element + " ");
	}
	
	//ctrl + space bar 
		
		
//		System.out.println(name);// java is block scoped
	}

}
