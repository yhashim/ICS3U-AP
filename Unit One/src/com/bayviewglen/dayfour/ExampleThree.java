package com.bayviewglen.dayfour;

import java.util.Scanner;
/*
 * using the scanner to read input from the user/keyboard.
 * 
 * ask for 3 digit int
 * 
 * display sum of the three digits to console
 */
public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 digit integer: ");
		int threeDigitNum = input.nextInt();
		
		/* this crashes code 
		if (threeDigitNum < 100 || threeDigitNum > 999) {
			throw new IllegalArgumentException("Number must be 3 digits");
		}
		*/
		
		while (threeDigitNum < 100 || threeDigitNum > 999) {
			System.out.println("Enter 3 digit integer: ");
			threeDigitNum = input.nextInt();
		}
		
			
		int digit1 = threeDigitNum / 100;
		int digit2 = threeDigitNum / 10 % 10;
		int digit3 = threeDigitNum % 10;
		
		double sum = digit1+digit2+digit3;
		
		System.out.println("The sum of: " + digit1 + ", " + digit2 + ", and " + digit3 + " equals " + sum);

	}

}
