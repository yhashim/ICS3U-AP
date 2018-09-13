package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// this program calculates the vol of a sphere using vars for the radius and vol
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = keyboard.nextInt();
		
		double vol = (4/3)*(Math.PI * radius * radius * radius);
		System.out.println(vol);

	}

}
