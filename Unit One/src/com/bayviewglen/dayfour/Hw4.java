package com.bayviewglen.dayfour;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//4
		System.out.println("Input a initial car velocity: ");
		int velocity = input.nextInt(); 
		System.out.println("Input car acceleration: ");
		int accel = input.nextInt(); 
		System.out.println("Input elapsed time (s): ");
		int time = input.nextInt();
		
		double finalVelo = velocity + accel*time;
		
		
		System.out.println("The final velocity when initial velocity equals: " + velocity + ", acceleration equals: " + accel + ", and the time elapsed is: " + time + " seconds, the final velocity equals: " + finalVelo);
	}

}
