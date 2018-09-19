package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input commission per item sold ($): ");
		double commission = input.nextDouble();
		System.out.println("Input number of items sold: ");
		int numSold = input.nextInt();
		
		double salary = commission * numSold;
		double roundedSalary = (Math.round(salary*100))*0.001;
		
		System.out.println("The salary, when commission per item sold = " + commission + ", and the number of items sold = " + numSold + ", = $" + roundedSalary);

	}

}
