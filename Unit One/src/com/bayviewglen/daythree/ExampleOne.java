package com.bayviewglen.daythree;

public class ExampleOne {

	public static void main(String[] args) {
		System.out.println(365/23);		// int divided by int = int
		System.out.println(365%23);		// % is the modulus operator 
										// (yeilds the remainder of operands)
		System.out.println(1/2);		// 0
		System.out.println(1%2);		// 1
		
		// If you mod something by 2 and mod yeilds 0, it is even
		int number = 365;
		if (number % 2 == 0) {
			System.out.println("Even"); // if we divide by 2 and recieve remainder 0, it is even
		} else {
			System.out.println("Odd");	// otherwise number is odd
		}
		
		System.out.println("The number " + number + " is divisible by 5:" + (number % 5 == 0));
		// the small part in brackets is like a mini if statement
		
		int counter = 1;
		while (counter <= 1000) {		// loop while true
			if (counter % 10 == 0) {	// checks if counter is divisible by 10
				System.out.println(counter);
			}
		counter ++;					// adds one to counter
		}
	}

}
