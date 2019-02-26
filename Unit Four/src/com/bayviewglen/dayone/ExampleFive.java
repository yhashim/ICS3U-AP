package com.bayviewglen.dayone;

public class ExampleFive {

	public static void main(String[] args) {
		// THIS IS IMPORTANT!
		// you must know how to get max/min values in arrays because sorting values need this!
		int[] arr = {3,5,6,6,6,6};
		
		int max = maxValue(arr);
		int maxIndex = getMaxIndex(arr);
		
		System.out.println("The max value in the array is: " + max + " and its index is: " + maxIndex + ".");
	}
	
	public static int maxValue(int[] arr) {
		// this finds the max element
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMaxIndex(int[] arr) {
		// this is finding the LOCATION of the max element
		int maxIndex = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
