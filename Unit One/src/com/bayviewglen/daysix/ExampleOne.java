package com.bayviewglen.daysix;

// looking at random numbers!

public class ExampleOne {

	public static void main(String[] args) {
		
		double x = Math.random(); 
		// returns value greater than or equal to 0 and less than 1
		System.out.println(x);
		
		// random number between 0 and 9
		y = (int)(Math.random() * 10);
		System.out.println(y);
		
		/*
		final int UNIQUE_NUMBERS = 10;
		for (int i=0; i<100; i++) {
			System.out.println((int)(Math.random() * UNIQUE_NUMBERS));
		}
		// keep adding 1 to i while its less than 100
		*/
		
		// need random number from 1 to 10
		final int UNIQUE_NUMBERS = 10;
		final int LOWER_BOUND = 1;
		z = (int)(Math.random() * UNIQUE_NUMBERS)+LOWER_BOUND;
		// prints numbers from 0 to 20
		// what you multiply by is the number of unique values you will receive
		System.out.println(z);
		
		/*
		// array to see how equally the numbers come out from Math.random
		int[] frequency = new int[UNIQUE_NUMBERS];
		for (int i=0; i<200000; i++) {
			z = (int)(Math.random() * UNIQUE_NUMBERS)+LOWER_BOUND;
			frequency[z-1]++;
		}
		System.out.println();
		*/
		
	}

}
