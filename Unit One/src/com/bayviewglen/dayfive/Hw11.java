package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter object mass (kg): ");
		double mass = input.nextDouble();
		System.out.println("Enter object speed (velocity): ");
		double velocity = input.nextDouble();
		
		double kineticEnergy = 0.5*mass*Math.pow(velocity, 2);
		
		System.out.println("Kinetic energy, when mass = " + mass + "kg, and velocity = " + velocity + ", = " + kineticEnergy);


	}

}
