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
		
		//2
		System.out.println("Input total marks for test ");
		int total = input.nextInt();
		int score = input.nextInt();
		double percent = 100.0*(total/score);
		
		System.out.println("Your score " + score + " out of " + total + " gives percent of " + percent);
				
	}

}
