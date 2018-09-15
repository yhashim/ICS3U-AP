package com.bayviewglen.dayfour;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//2
		System.out.println("Input total marks for test ");
		int total = input.nextInt();
		System.out.println("Input score recieved of the total marks ");
		int score = input.nextInt();
		double percent = 100*((double)score/(double)total);
				
		System.out.println("Your score " + score + " out of " + total + " gives percent of " + percent);

	}

}
