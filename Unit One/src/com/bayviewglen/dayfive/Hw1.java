package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input item price: ");
		double price = input.nextDouble(); 
		System.out.println("Input sales tax: ");
		double tax = input.nextDouble();
		
		double total = price + (price*tax/100); 
		
		System.out.println("The total price of the purchase $"+((Math.round(total*100))*0.01));

	}

}
