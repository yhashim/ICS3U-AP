package com.bayviewglen.daythree;

public class ExampleThree {
	/* Types of Errors */
	public static void main(String[] args) {
		// ints x, y; // Syntax error. There is an issue with the code - doesn't make sense.
		
		/*
		int x = 7;
		int y = x /0; // Run-time Exception - java throws Arithmetic Exeption - cannot divide numbers by 0
		
		System.out.println(y);
		*/
		
		int radius = 3;
		double areaOfCircle = Math.PI * 2 * radius;
			// logic error - code compiles and runs
			// sometimes goes unnoticed
			// should be Math.PI * Math.pow(radius, 2)
		System.out.println("Area of the cirlce is: " + areaOfCircle);
		
	}

}
