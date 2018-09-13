package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		// this program solves for slope of line (m) when given (x1,y1) and (x2,y2)
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter x1");
		double xOne = keyboard.nextInt();
		System.out.println("Enter y1");
		double yOne = keyboard.nextInt();
		System.out.println("Enter x2");
		double xTwo = keyboard.nextInt();
		System.out.println("Enter y2");
		double yTwo = keyboard.nextInt();
		
		double m = (yTwo - yOne)/(xTwo - xOne);
		
		System.out.println("With " + xOne + " as x1, " + yOne + " as y1, " + xTwo + "as x2, and " + yTwo + " as y2, m =" + m);

	}

}
