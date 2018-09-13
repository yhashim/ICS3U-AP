package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// this program calculates the area of a circle using vars for the radius and area
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = keyboard.nextInt();
		
		double area = Math.PI * radius * radius;
		System.out.println(area);

	}

}
