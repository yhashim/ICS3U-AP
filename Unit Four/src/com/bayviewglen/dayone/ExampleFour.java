package com.bayviewglen.dayone;

public class ExampleFour {

	public static void main(String[] args) {
		int[] arr = {3,5,6,10,-2,11};
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(i + ": " + arr[i]);
		}
		
		System.out.println();
		
		mystery(arr); // calls the function w/ parameter arr
		// since we pass in arrays like objects, we pass it in by reference, so the reference is getting changed in the method
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(i + ": " + arr[i]);
		}
	}

	private static void mystery(int[] arr) {
		arr[2] = 29;		
	}

}
