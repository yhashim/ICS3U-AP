package com.bayviewglen.daytwo;

public class ExampleThree {

	public static void main(String[] args) {
		String[] arr = { "Apple", "Pear", "Grape", "Almond" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

		System.out.println();

		int i = 0;
		// this is a for-each loop
		// the for-each loop's purpose it to iterate through the array or collection from beginning to end
		// there is no index - if you need an index, don't use a for-each loop, use the for loop
		for (String el : arr) {
			// syntax: variable that will be a copy of the next element : the collection to iterate through
			// el iterates through the multiple elements of the array - referencing to their references
			System.out.println(el);
			System.out.println(arr[i]);
			i++;
		}

		// added
		int[] pixels = { 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0 };

		int numOnes = 0;
		for (int pixel : pixels) {
			if (pixel == 1)
				numOnes++;
		}
		
		System.out.println(numOnes);

	}
}
