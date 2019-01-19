package com.bayviewglen.dayone;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ask a person for a mark
		Scanner in = new Scanner(System.in);
		System.out.println("Insert mark: ");
		int mark = Integer.parseInt(in.nextLine());
		
		if (mark >= 80) {
			System.out.println("You recieved an A");
		} else if (mark >= 70) {
			System.out.println("You recieved an B");
		} else if (mark >= 60) {
			System.out.println("You recieved an C");
		} else if (mark >= 50) {
			System.out.println("You recieved an D");
		} else {
			System.out.println("You have failed life and should go to Mordor.");
		}
		
		// shoe example
		String colour = "red";
		int maxShoeSize = 10;
		
		System.out.print("Please enter the size of your shoes: ");
		String shoeSizeString1 = in.nextLine(); // size as string
		int shoeSize1 = Integer.parseInt(shoeSizeString1);
		
		System.out.print("Please enter the colour of your shoes: ");
		String colour1 = in.nextLine(); 
		if((shoeSize1 <= maxShoeSize) && (colour1.equals(colour))) {
			System.out.println("You have small red shoes!");
		} else {
			if(!colour1.equals(colour)) {
				System.out.println("You shoes aren't red!");
			} 
			if (shoeSize1 > maxShoeSize) {
				System.out.println("You have big feet!");
			}
		}
	
	}
}


