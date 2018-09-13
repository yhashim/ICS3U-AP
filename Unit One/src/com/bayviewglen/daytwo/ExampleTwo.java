package com.bayviewglen.daytwo;

/*
 * 1. Another primitive data type >> doubles
 * 2. Casting
 */

public class ExampleTwo {
	/*
	 * Get the average of 3 marks - do it twice
	 */
	public static void main(String[] args) {
		double markOne = 70, markTwo = 75, markThree = 70;
		// we declared the marks as doubles because they may be decimals
		
		double averageMark = (markOne + markTwo + markThree)/3;
		
		System.out.println("The average of the three marks is " + averageMark);
		// in this line I concatenate this string with the avrg mark to be printed
		// what is printed to the console: The average of the three marks is 71.66666666666667
		
		int testOne = 70, testTwo = 75, testThree = 70;
		// we declared the marks as doubles because they may be decimals
		
		averageMark = (testOne + testTwo + testThree)/3;
		
		System.out.println("The average of the three marks is " + averageMark);
		// in this line I concatenate this string with the avrg mark to be printed
		// since we assigned the values as ints, the return value is different
		// console print: The average of the three marks is 71.0
		// we did not recieve the full decimal because when you have 2 ints as operands, we return an int 
		
		averageMark = (testOne + testTwo + testThree)/3.0;
		// by changing 3 to 3.0 we are making an int divided by a double, returning a double
		System.out.println("The average of the three marks is " + averageMark);
		// The average of the three marks is 71.66666666666667
		
		int numTests = 3;
		averageMark = (double)(testOne + testTwo + testThree)/numTests;
		// this is CASTING - we cast the int to a double so that we can recieve an answer with the decimals while optimizing space use
		System.out.println("The average of the three marks is " + averageMark);
		// The average of the three marks is 71.66666666666667
		
		averageMark = (testOne + testTwo + testThree)/(double)numTests;
		// here we casted the numTests as a double for the operation 
		System.out.println("The average of the three marks is " + averageMark);
		// The average of the three marks is 71.66666666666667
		
	}

}
