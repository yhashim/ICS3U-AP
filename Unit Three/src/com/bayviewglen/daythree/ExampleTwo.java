package com.bayviewglen.daythree;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = 0;
		int sum = 0;
		boolean isDone = false;
		
		// we do not know how many times we need to execute
		// we wil use a while loop for that reason
		while(!isDone) {
			System.out.print("Please enter a number: ");
			x = in.nextInt();
			if (x%2==1)
				isDone = true;
			else
				sum += x;
		}
		
		System.out.println("The sum of the numbers is: " + sum);

		in.close();
	}

}
