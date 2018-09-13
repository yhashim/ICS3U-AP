package com.bayviewglen.daythree;

public class ExampleFour {

	public static void main(String[] args) {
		int numberOfSides = 6;			// just a var, can be changed at any time in the code
		
		final int NUMBER_OF_SIDES = 6;	// finals modifies the variable 
										// constant - never changes
		
		// NUMBER_OF_SIDES = 23;		// you can't change a constant!
		
		// E.g: You have 23 students and want to get the average f their test scores...
		
		final int NUM_OF_STUDENTS = 23;
		int sumOfTestScores = 1978;
		
		double averageTestScore = sumOfTestScores / NUM_OF_STUDENTS;
		
		// Use constants to improve readability
		// Use constants to improve maintainability -> maybe the constant if used in lots of places
													// we can easily update it
		
	}

}
