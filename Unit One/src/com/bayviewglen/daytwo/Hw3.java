package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// this program solves for y from y=ax2+bx+c given a,b,c,x
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a");
		double a = keyboard.nextInt();
		System.out.println("Enter b");
		double b = keyboard.nextInt();
		System.out.println("Enter c");
		double c = keyboard.nextInt();
		System.out.println("Enter x");
		double x = keyboard.nextInt();
		
		double y = ((Math.pow((a*x), 2)) + b*c + c);
		
		System.out.println("With " + a + " as a, " + b + " as b, " + c + "as c, and " + x + " as x, y = " + y);

	}

}
