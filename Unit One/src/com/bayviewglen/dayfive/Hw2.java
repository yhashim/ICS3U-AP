package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input rectangle length: ");
		double length = input.nextDouble(); 
		System.out.println("Input rectangle width: ");
		double width = input.nextDouble();
		
		double area = (length*width); 
		double perimeter = ((2*length)+(2*width));
		
		System.out.println("The area of the rectangle is: " + ((Math.round(area))/10.0) + " meters squared");
		System.out.println("The perimeter of the rectangle is: " + ((Math.round(perimeter))/10.0) + " meters squared");
	}

}