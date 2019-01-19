package com.bayviewglen.dayone;
/*
 * Boolean Expressions
 * 
 * 1. Simple Expressions
 * 2. Compound Expressions 
 */
public class ExampleOne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		
		// this is a simple boolean expression
		// boolean expressions evaluate to true or false
		boolean result1 = x > 7;
		// result1 = false
		// (7 > 7 = false)
		
		System.out.println(result1); // returns a primitive boolean
		
		String colour = "red";
		int maxShoeSize = 10;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the size of your shoes: ");
		String shoeSizeString1 = in.nextLine(); // size as string
		int shoeSize1 = Integer.parseInt(shoeSizeString1);
		
		System.out.print("Please enter the colour of your shoes: ");
		String colour1 = in.nextLine(); 
		
		boolean isSmallRedShoes = (shoeSize1 <= maxShoeSize) && (colour1.equals(colour)); 
		System.out.println(isSmallRedShoes);

	}

}
