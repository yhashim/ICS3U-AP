package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input wins: ");
		double wins = input.nextDouble(); 
		System.out.println("Input losses: ");
		double losses = input.nextDouble();
		
		double totalGames = wins + losses;
		double percentageWins = (wins/totalGames)*100;
		
		System.out.println("The percentage of games won equals: " + (Math.round(percentageWins)) + "%");
		
	}

}
