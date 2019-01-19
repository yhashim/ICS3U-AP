package com.bayviewglen.dayfive;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;
		int x = 10;
		System.out.println("1. " + x);
		mystery(x);
		System.out.println("4. " + x);
		x = mystery2(x);
		System.out.println("5. " + x);
		
		// returns 10,10,11,10
		// because in java, arguments/parameters use a copy of what is in the box
		
		// int result = cube(number);
		// System.out.println("The result: " + result);

	}
	
	// all of our methods will be public static for now
	// public static return type mathodName(argumentList){...}
	// public refers to method's publicity - everyone can use the method
	// this method already belongs to the class (static)
	// int is the return type
	public static int cube(int x) {
		return (int)Math.pow(x, 3);	// this must be casted as an int bc Math.pow returns doubles, must be same as returnType
	}
	
	// mystery method
	// void = returns nothing
	public static void mystery(int x) {
		System.out.println("2. " + x);
		x++;
		System.out.println("3. " + x);
	}
	
	public static int mystery2(int x) {
		return ++x;
	}

}
