package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		// this program solves for the zeroes when given a, b, and c of y=ax2+bx+c
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter value of a");
		double a = keyboard.nextInt();
		System.out.println("Enter value of b");
		double b = keyboard.nextInt();
		System.out.println("Enter value of c");
		double c = keyboard.nextInt();
				
		double xIntOne = ((-1*b)+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
		double xIntTwo = ((-1*b)-(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
		
		System.out.println("With " + a + " as a, " + b + " as b, and " + c + " as c, our roots are " + xIntOne + " and " + xIntTwo);

	}

}