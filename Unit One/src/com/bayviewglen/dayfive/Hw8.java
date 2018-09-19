package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a positive number: ");
		double posNum = input.nextDouble(); 
		
		while (posNum <= 0) {
			System.out.println("That is not positive. Try again: ");
			posNum = input.nextDouble(); 
		}

		double posNumSquare = (Math.round(Math.pow(posNum, 2)));
		double posNumRoot = (Math.round(Math.sqrt(posNum)));
		double roundedRoot = (Math.round(posNumRoot*1000))*0.001;
		
		System.out.println(posNum + " squared equals: " + posNumSquare + ", and has a square root of: " + roundedRoot);
		
	}

}