package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		// arrays
		// arrays are visualized like strings - a variable referencing a series of boxes storing things
		// an array needs to hold elements of the SAME DATA-TYPE
			// if it is initialized to hold ints, it only holds ints
		// an array is not primitive - it is very similar to how we deal with object types (reference types) BUT IT IS NOT AN OBJECT
		// since it is not an object it has NO METHODS
		// the variable holds a reference to the actual array
		// one property of an array is called LENGTH
			// eg. a var called arr holding an array can use arr.length to access its length
			// it is not arr.length() (brackets) because it is NOT A METHOD, it is a PROPERTY
		
		int[] arr = new int[5];	// constructs an array of size 5
		// declared a reference to an int array
		// constructs a new int array of size 5
		// assigns the variable arr to the new int array
		// by default, it is filled with 0's because primitives are set as 0 if not initialized
		
		// to access the individual elements we use []
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(i + ": " + arr[i]);
			// arr[i] finds whatever is at the index "i"
		}
		
		System.out.println();
		
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 3;
		arr[4] = 10;
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(i + ": " + arr[i]);
			// arr[i] finds whatever is at the index "i"
		}
		
		System.out.println();

	}

}
