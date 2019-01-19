package com.bayviewglen.dayfive;

import java.util.Scanner;

public class DiceGame {
	// Two player game
	// Player 1 and Player 2
	// First to get over 50 pts wins
	// Option to roll 1 or 2 dice
	// If you roll a 4 or 10, you lose 5 pts
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int playerOneScore = 0;
		int playerTwoScore = 0;
		
		final int GOAL = 50;
		
		boolean isGameOver = false;
		while (!isGameOver) {
			playerOneScore = playerTurn(in, "PlayerOne", playerOneScore);
			playerTwoScore = playerTurn(in, "PlayerTwo", playerTwoScore);
			
			displayScore("PlayerOne", playerOneScore);
			displayScore("PlayerTwo", playerTwoScore);
						
			if (playerOneScore > GOAL || playerTwoScore > GOAL) {
				isGameOver = true;
			}
		
		}
		
		displayWinner("PlayerOne", playerOneScore, "Player Two", playerTwoScore);
		in.close();
		
	}

	public static void displayWinner(String playerOne, int playerOneScore, String playerTwo, int playerTwoScore) {
		if (playerOneScore > playerTwoScore) {
			System.out.println(playerOne + " WINS!!!");
		} else if (playerOneScore < playerTwoScore) {
			System.out.println(playerTwo + " WINS!!!");
		} else {
			System.out.println("No one cries... everyone ties!");
		}
		
	}

	public static void displayScore(String playerName, int playerScore) {
		System.out.println(playerName + " score: " + playerScore);
	}

	public static int playerTurn(Scanner in, String playerName, int playerScore) {
		System.out.print(playerName + ", how many dice would you like to roll (1 or 2)?");
		int numDice = getNumRolls(in); 
		int currentTurn = 0;
		
		for (int i=0; i<numDice; i++) {
			int currentRoll = roll();
			System.out.println(playerName + " rolled a " + currentRoll);
			currentTurn += currentRoll;
		}
		if (currentTurn == 4 || currentTurn == 10) {
			playerScore -= 5;
			System.out.println(playerName + " you lost 5 points...");
		} else {
			playerScore += currentTurn;
		}
		
		return playerScore;
	}
	
	public static int getNumRolls(Scanner in) {
		int x = 0;
		boolean validInput = false;
		while(!validInput) {
			try{
				x = Integer.parseInt(in.nextLine());
				if (x < 1 || x > 2) {
					System.out.println("Please enter 1 or 2");
				} else {
					validInput = true;
				}
			}catch(Exception ex) {
				System.out.println("Please enter 1 or 2");
			}
		}
		return x;
	}

	public static int roll() {
		return (int)(Math.random()*6) + 1;
	}

}
