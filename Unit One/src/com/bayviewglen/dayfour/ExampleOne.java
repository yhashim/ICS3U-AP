package com.bayviewglen.dayfour;

import java.util.Scanner; // tells our program to use the scanner when compiling
	/*
	 * Declaring a scanner to read input from keyboard.
	 * 
	 * Read scanner int data.
	 * 
	 * Prompt the user for three diff ints and display the avrg. of the three nums.
	 */

public class ExampleOne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); /* kind of scanner specified in scanner... 
		 										 * System.in is our automatic input 
		 										 * the variable input references to our scanner (line 3)
		 										 */
		// with primitive data types we store a chosen value but...
		// Scanner is an OBJECT type NOT PRIMITIVE
		// OBJECT and PRIMITIVE are the only data types
		
		int x, y, z;
		System.out.print("Enter 3 integers: ");
		x = input.nextInt(); // by default the brackets are base 10
		y = input.nextInt();
		z = input.nextInt();
		
		double avrg = (x+y+z)/3.0;
		
		System.out.println("The average of " + x + ", " + y + ", and " + z + " equals " + avrg);
		
	}

}
