package com.bayviewglen.dayone;

public class ExampleSix {

	public static void main(String[] args) {
		// sequential (linear) search
		int[] arr = {3,5,6,10,-2,11};
		int value = 6; // the val we are looking for
		
		int index = sequentialSearch(arr, value);
		
		if (index >= 0) {
			System.out.println("The value was located at the index: " + index);
		} else {
			System.out.println("The value was not found in the array.");
		}

	}

	private static int sequentialSearch(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
