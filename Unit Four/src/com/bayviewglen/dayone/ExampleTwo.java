package com.bayviewglen.dayone;

public class ExampleTwo {

	public static void main(String[] args) {
		int[] arr = {3,5,6,10,-2,11}; // this array is size 6
		// people don't usually declare arrays like this
		// this is a fast way to initialize the array if you know exactly what will be in it
		
		// arr = {2,3};
		// line above is impossible
		// the only time we can use this type of initialization for an array IS WHEN WE DECLARE IT
		// IT MUST BE DONE RIGHT WHEN THE ARRAY IS DECLARED
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(i + ": " + arr[i]);
			// arr[i] finds whatever is at the index "i"
		}
		
		System.out.println();
		
		arr = new int[3];
		// this constructs a new array size 3, filled with 0's, and makes arr now reference this array
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(i + ": " + arr[i]);
			// arr[i] finds whatever is at the index "i"
		}

	}

}
