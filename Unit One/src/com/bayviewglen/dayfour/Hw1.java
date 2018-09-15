package com.bayviewglen.dayfour;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// 1 
		System.out.println("Input a number (double): ");
		double number = input.nextDouble();
		
		System.out.println("Your number " + number + " squared equals: " + Math.pow(number, 2));
				
	}

}
