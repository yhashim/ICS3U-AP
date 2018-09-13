package com.bayviewglen.daytwo;

/*
 * String Concatenation
 */
public class ExampleThree {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
		System.out.println(x + y + " are our numbers.");
		System.out.println(x + (y + " are our numbers."));
		// here we concatenate y and are our numbers, and put the x in the front
		System.out.println("" + x + y + " are our numbers.");
		/*
		 * "" + 1
		 * "1" + 2
		 * "12" + " are our numbers."
		 * "12 are our numbers."
		 */
		System.out.println(x + " " + y + " are our numbers.");
		/*
		 * "1 "
		 * "1 " + 2
		 * "1 2" + " are our numbers."
		 * "1 2 are our numbers."
		 */
		
		// Math.PI is pi, Math.sqrt(5), Math.pow(a, b) where a is the base and b is the power
	}

}
