package com.bayviewglen.daytwo;

/*
 * Topics:
 * 1. Declaring Variables
 * 2. Primitive Data Types
 * 3. Assignment Operator
 * 4. String Concatenation
 * 5. CTRL-SHIFT-F is auto indent/format (Select All First CTRL-A)
 */

public class ExampleOne {

	public static void main(String[] args) {
		// Anything declared within the main is considered "local"
		// Primitive data is just a plain value 
		int x; 		// declared x as a primitive integer
		int y = 10; // declared y as a primitive integer and initialized it as ten
		
		x = 17;		// x is assigned a value of 17 (= is the assignment operator)
		// the things to the left and right of the operator are the operands
		// the left operand must be a variable
		int z = x + y;
		
		System.out.println(z);
		
		int numberOne, numberTwo = 19;
		
		numberOne = 8;
		//declare variables when you need them - not all at the top, as they will take up space set aside
		//storing values in an int does not use them, the line below is an eg. of how you can use them
		int sum = numberOne + numberTwo;
		
		System.out.println(numberOne + " +  " + numberTwo + " = " + sum);
		// we just concatenated numberone with a plus, number two, an equal sign, and the sum
		// we use the plus sign to concatenate things within the brackets to print
		// we connected 5 things together, three ints and two strings
		
	}

}
