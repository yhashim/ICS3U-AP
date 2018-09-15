package com.bayviewglen.dayfour;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//3
		System.out.println("Input a five digit number: ");
		int number = input.nextInt(); 
		int second = number / 1000 % 10;
		int fourth = number / 10 % 10;
		int product = second * fourth;
		
		System.out.println("The product of the second digit: " + second + " and the fourth digit: " + fourth + " is: " + product);
	}

}
