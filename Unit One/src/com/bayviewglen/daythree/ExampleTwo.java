package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		int number = 21021;
		// return sum of digits of the number
		
		int digit1 = number / 10000;		// 21021/10000 = 2
		int digit2 = number / 1000 % 10;	// 21021/1000 = 21 % 10 = 1
		int digit3 = number / 100 % 10;		// 21021/100 = 210 % 10 = 0
		int digit4 = number / 10 % 10;		// 21021/10 = 2102 % 10 = 2
		int digit5 = number % 10;			// 21021/10 = 2102 remainder 1
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		System.out.println("The sum of all the digits in: " + number + " equals " + sum);

	}

}
