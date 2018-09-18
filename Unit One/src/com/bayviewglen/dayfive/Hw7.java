package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input degrees in Fahrenheit: ");
		double fDegrees = input.nextDouble(); 

		double cDegrees = (fDegrees - 32)/1.8;
		
		System.out.println((Math.round(fDegrees)) + " degrees Fahrenheight is " + (Math.round(cDegrees)) + " degrees Celcius");
		
	}

}
