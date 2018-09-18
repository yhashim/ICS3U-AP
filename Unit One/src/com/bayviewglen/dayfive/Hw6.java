package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input item mass (kg): ");
		double mass = input.nextDouble(); 
		System.out.println("Input travelling speed (m/s): ");
		double velocity = input.nextDouble();
		
		double momentum = mass * velocity;
		
		System.out.println("The momentum of an item weighing about: " + (Math.round(mass)) + "kg, travelling at about: " + (Math.round(velocity)) + "m/s, has a momentum of (around): " + (Math.round(momentum)));
		
	}

}
