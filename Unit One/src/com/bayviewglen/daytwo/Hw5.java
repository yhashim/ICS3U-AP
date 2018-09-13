package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		// this program solves for amount of cash from inserted pennies, nickles, dimes, quarters, loonies and toonies
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter num of pennies");
		double pennies = keyboard.nextInt();
		System.out.println("Enter num of nickles");
		double nickles = keyboard.nextInt();
		System.out.println("Enter num of dimes");
		double dimes = keyboard.nextInt();
		System.out.println("num of quarters");
		double quarters = keyboard.nextInt();
		System.out.println("Enter num of loonies");
		double loonies = keyboard.nextInt();
		System.out.println("Enter num of toonies");
		double toonies = keyboard.nextInt();
				
		double cash = 0.01*(pennies) + 0.05*(nickles) + 0.1*(dimes) + 0.25*(quarters) + loonies + 2*(toonies);
		
		System.out.println("With " + pennies + " pennies, " + nickles + " nickles, " + dimes + " dimes, " + quarters + " quarters, " + loonies + " loonies, and " + toonies + " toonies, the total cash owned = " + cash);

	}

}
