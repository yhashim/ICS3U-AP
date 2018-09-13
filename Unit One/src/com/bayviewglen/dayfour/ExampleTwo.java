package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		// calculate surface area of box from input length and width of base
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length and width of box's base in meters: ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		System.out.println("Enter box's height (meters): ");
		double height = input.nextDouble();
		
		double SA = 2*(length*width)+2*(length*height)+2*(width*height);		
		System.out.println("The surface area of the box with dimensions: " + length + ", " + width + ", and " + height + " equals " + SA + " square meters");
		

	}

}
