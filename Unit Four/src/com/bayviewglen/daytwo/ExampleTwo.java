package com.bayviewglen.daytwo;

public class ExampleTwo {

	public static void main(String[] args) {
		String[] arr = {"Apple", "Pear", "Grape", "Almond"};
		
		// arr = {2, 3};
		
		for (int i=0; i<arr.length; i++){
			System.out.println(i + ": " + arr[i]);
		}
		
		String[] arr2 = arr; // gives arr2 (our new array) the same reference as arr
		
		System.out.println(arr);
		System.out.println(arr2);
		
		System.out.println();
		
		arr = new String[3];
		
		for (int i=0; i<arr.length; i++){
			System.out.println(i + ": " + arr[i]);
		}
		
		System.out.println(arr);
		System.out.println(arr2);
		
	}

}
