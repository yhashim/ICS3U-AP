package com.bayviewglen.dayone;

public class ExampleThree {

	public static void main(String[] args) {
		int[] arr = {3,5,6,10,-2,11};
		
		// now we are looking at passing arrays to methods
		
		int sum = getSum(arr);
		
		System.out.println("The sum of the array is: " + sum);
		
	}

	private static int getSum(int[] arr1) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i ++) {
			sum += arr1[i];
		}
		return sum;
	}

}
