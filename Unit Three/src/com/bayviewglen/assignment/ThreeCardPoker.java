package com.bayviewglen.assignment;

import java.util.Scanner;

/* 
 * 3 card poker assignment 
 * Yosra Hashim
 * Unit 3 ICS3UAP
 * Due date: end of the day on 11/28/2018
 * Submitted: end of the day on 11/28/2018
 */

public class ThreeCardPoker {
	// constants for the game
	public static final int NUM_SUITS = 4;
	public static final double NUM_FACES = 13;
	public static final int MIN_BET = 50;
	public static final int MAX_BET = 100;
	public static final int BLACK_JACK = 21;
	public static final int PLAY = 1;
	// constants for hand types (their value will be multiplied into the pair plus winnings)
	private static final int STRAIGHT_FLUSH = 40;
	private static final int THREE_OF_A_KIND = 30;
	private static final int STRAIGHT = 6;
	private static final int FLUSH = 3;
	private static final int PAIR = 1;
	private static final int HIGH_CARD = 0;

	public static void main(String[] args) {
		int playerWallet = 500; // player wallet is an int so we can change it to different numbers whenever we want obviously
		Scanner in = new Scanner(System.in);
		boolean isGameOver = false;

		System.out.println("Welcome to three card poker at the Lasagna Casino! Your wallet currently has $" + playerWallet + ". ");
		System.out.println();

		while (!isGameOver) {
			String playerHand = "";
			String dealerHand = "";

			int anteWager = getAnteWager(in, playerWallet);
			playerWallet -= anteWager;
			System.out.println("$" + anteWager + " deducted from wallet. Your current balance is now: $" + playerWallet);

			int pairPlusWager = getPairPlus(in, playerWallet, anteWager);
			playerWallet -= pairPlusWager;
			System.out.println("$" + pairPlusWager + " deducted from wallet. Your current balance is now: $" + playerWallet);
			
			dealerHand = "XX " + "XX " + "XX";	// show the player that the dealer has gotten cards (however we don't yet know what they are)

			for (int i = 0; i < 3; i++) {
				// get the player's hand
				String card = getCard();
				playerHand += card + " ";
			}

			System.out.println("Dealer: " + dealerHand);
			System.out.println("Player: " + playerHand);

			String playerHighestCard = highestCard(playerHand);

			int playerHandType = handType(playerHand);
			// tell the player what kind of hand they have (in case they don't notice they have a good/bad hand)
			if (playerHandType == STRAIGHT_FLUSH) {
				System.out.println("You got a straight flush!");
			} else if (playerHandType == THREE_OF_A_KIND) {
				System.out.println("You got three of a kind!");
			} else if (playerHandType == STRAIGHT) {
				System.out.println("You got a straight!");
			} else if (playerHandType == FLUSH) {
				System.out.println("You got a flush!");
			} else if (playerHandType == PAIR) {
				System.out.println("You got a pair!");
			} else {
				System.out.println("You got " + playerHighestCard + "-high.");
			}

			String dealerHandRevealed = "";
			boolean isPlayerDoneRound = false;

			while (!isPlayerDoneRound) {
				// continue doing code below until the player has finished
				int playerOption = getPlayOrFold(in); // 1 they play, 2 they fold
				boolean playerContinues = (playerOption == PLAY);
				if (playerContinues) {
					if ((playerWallet - anteWager) < 0) {
						// the player cannot continue with no money
						playerContinues = false;
						isPlayerDoneRound = true;
						isGameOver = true;
						System.out.println("You do not have enough money to continue this game. Game over!");
						System.exit(0); // this is the most useful thing on earth, I love this! <3 made life so much easier... :)
										// got this amazing method from https://stackoverflow.com/questions/457338/use-of-system-exit0
					}
					playerWallet -= anteWager; // subtract the play wager - although it says ante wager I'm subtracting the play wager (they are the same value)
					System.out.println("$" + anteWager + " deducted from wallet. Your current balance is now: $" + playerWallet);
					for (int i = 0; i < 3; i++) {
						// get the dealer's hand (basically so we can "flip over" the dealer's cards and show them to the player if the player doesn't fold)
						String card = getCard();
						dealerHandRevealed += card + " ";
					}
					System.out.println("Dealer: " + dealerHandRevealed);
					System.out.println("Player: " + playerHand); // this isn't necessary, but we are printing out the player hand again so they player doesn't have to scroll back to look for it
					String dealerHighestCard = highestCard(dealerHandRevealed);
					int winner = getWinner(playerHand, dealerHandRevealed); // 1 = player win, 2 = dealer win, 3 = push/tie
					int dealerHandType = handType(dealerHandRevealed);
					if (dealerHandType == HIGH_CARD && (!(dealerHighestCard.equals("ace")) && !(dealerHighestCard.equals("king")) && !(dealerHighestCard.equals("queen")))) {
						// if the highest card for the dealer is not A, K, Q, then it is Jack-high or lower
						playerWallet += anteWager; // player gains the play wager (which is equivalent to the ante wager - that's why I used the anteWager variable... it works)
						System.out.println("The dealer got " + dealerHighestCard + "-high. Your play wager of $" + anteWager + " has been returned to your wallet. Your current balance is now: $" + playerWallet);
						isPlayerDoneRound = true;
					} else { // the dealer's hand is queen-high or higher
						// tell the player what the dealer's hand type is (in case they are bad at playing and don't know why they lost or something)
						if (dealerHandType == STRAIGHT_FLUSH) {
							System.out.println("The dealer got a straight flush!");
						} else if (dealerHandType == THREE_OF_A_KIND) {
							System.out.println("The dealer got three of a kind!");
						} else if (dealerHandType == STRAIGHT) {
							System.out.println("The dealer got a straight!");
						} else if (dealerHandType == FLUSH) {
							System.out.println("The dealer got a flush!");
						} else if (dealerHandType == PAIR) {
							System.out.println("The dealer got a pair!");
						}
						if (winner == 1) { // player wins
							playerWallet += 4 * anteWager; // play wager and the ante are paid out at 1 to 1
							System.out.println("You win! You flash your pile of money at the dealer who begins to cry. Both your play wager and ante wager ($" + anteWager + ") were returned to your wallet (1:1)!");
							System.out.println("Your current balance is now: $" + playerWallet);
							isPlayerDoneRound = true;
						} else if (winner == 2) { // dealers wins
							// both the ante and play bets are collected
							System.out.println("You have lost this round... The dealer has taken your play and ante wagers from the table and waved them sassily in your face.");
							System.out.println("Your current balance is now: $" + playerWallet);
							isPlayerDoneRound = true;
						} else { // push/tie
							playerWallet += anteWager;
							System.out.println("This round was a push.");
							System.out.println("Your play wager of $" + anteWager + " has been returned to your wallet. Your current balance is now: $" + playerWallet);
							isPlayerDoneRound = true;
						}
					}
					// give them the pair plus if they won any
					if (playerHandType == STRAIGHT_FLUSH) {
						playerWallet += pairPlusWager; // return the money
						playerWallet += pairPlusWager * STRAIGHT_FLUSH; // give the extra
						System.out.println("You have won a pair plus of $" + pairPlusWager * STRAIGHT_FLUSH + ". Your balance is now: $" + playerWallet);
					} else if (playerHandType == THREE_OF_A_KIND) {
						playerWallet += pairPlusWager;
						playerWallet += pairPlusWager * THREE_OF_A_KIND;
						System.out.println("You have won a pair plus of $" + pairPlusWager * THREE_OF_A_KIND + ". Your balance is now: $" + playerWallet);
					} else if (playerHandType == STRAIGHT) {
						playerWallet += pairPlusWager;
						playerWallet += pairPlusWager * STRAIGHT;
						System.out.println("You have won a pair plus of $" + pairPlusWager * STRAIGHT + ". Your balance is now: $" + playerWallet);
					} else if (playerHandType == FLUSH) {
						playerWallet += pairPlusWager;
						playerWallet += pairPlusWager * FLUSH;
						System.out.println("You have won a pair plus of $" + pairPlusWager * FLUSH + ". Your balance is now: $" + playerWallet);
					} else if (playerHandType == PAIR) {
						playerWallet += pairPlusWager;
						playerWallet += pairPlusWager * PAIR;
						System.out.println("You have won a pair plus of $" + pairPlusWager * PAIR + ". Your balance is now: $" + playerWallet);
					} else {
						System.out.println("You have not recieved any pair plus winnings... :(");
					}
					playerContinues = false;
				} else { // They folded
					isPlayerDoneRound = true;
					System.out.println("This round is now over. The dealer has collected your ante wager of $" + anteWager + " and pair plus wager of $" + pairPlusWager + " and slips it into his fat wallet. ");
					System.out.println("You now have $" + playerWallet + " in your wallet. ");
				}
			}
			if (playerWallet < MIN_BET * 2) { // no point in playing if you don't have enough money to properly play a round!
				System.out.println("You do not have enough money to continue playing with us... however... ");
				System.out.println("~ congratulations as you have successfuly frivoled away your moola and future! Thank you for coming to the Lasagna Casino. Have a good day!");
				System.exit(0); // using this again - it's the best!
			} else {
				isGameOver = !playAgain(in, playerWallet);
			}
		}
	}

	private static int getPlayOrFold(Scanner in) {
		// see if the player wants to continue or fold after they got to see their cards
		boolean isValidInput = false;
		while (!isValidInput) { // make sure they give a valid answer
			System.out.print("Would you like to bet a play wager? Yes (1) or No (2)? ");
			String x = in.nextLine();
			if (x.equals("1") || x.equals("2"))
				return Integer.parseInt(x);
		}
		return 0;
	}

	private static int getPairPlusChoice(Scanner in) {
		// ask the player if they think they're lucky and want to bet a pair plus wager
		boolean isValidInput = false;
		while (!isValidInput) { // make sure they give a valid answer
			System.out.print("Would you like to bet the optional pair plus wager? Yes (1) or No (2)? ");
			String x = in.nextLine();
			if (x.equals("1") || x.equals("2"))
				return Integer.parseInt(x);
		}
		return 0;
	}

	private static boolean playAgain(Scanner in, int playerWallet) {
		// find out if the player wants to play again
		if (playerWallet < MIN_BET) {
			return false;
		}
		System.out.println("");
		System.out.print("Play Again? (Y/N): ");
		
		boolean isValidInput = false;
		while (!isValidInput) { // make sure they give a valid answer
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("yes") || temp.equals("y"))
				return true;
			else if (temp.equals("no") || temp.equals("n"))
				return false;
			else
				System.out.print("Play Again? (Y/N): ");
		}
		return false;
	}

	private static int getAnteWager(Scanner in, int playerWallet) {
		// get the player's ante wager
		System.out.print("Please enter your ante wager ($" + MIN_BET + " min, $" + MAX_BET + " max): ");

		boolean isValidBet = false;
		int maxBet = Math.min(MAX_BET, playerWallet / 2);
		
		while (!isValidBet) { // make sure they give a valid answer
			try {
				int x = Integer.parseInt(in.nextLine());
				if (x >= MIN_BET && x <= maxBet) // if the bet works
					/*
					 * check for if x <= Math.min(MAX_BET, playerWallet/2) rather than x <= MAX_BET
					 * because it is logically impossible to go over the playerWallet/2 because then
					 * you cannot continue the game... this makes sure you can continue the game with other
					 * bets (so it is possible)
					 */
					return x;
				else
					System.out.print("Invalid bet ($" + MIN_BET + " min, $" + MAX_BET + " max (technically $" + maxBet + " to logically continue the game), your wallet: $" + playerWallet + "): ");
			} catch (Exception ex) {
				System.out.print("Invalid bet ($" + MIN_BET + " min," + MAX_BET + " max (technically $" + maxBet + " to logically continue the game): ");
			}
		}
		return 0;
	}

	private static int getPairPlus(Scanner in, int playerWallet, int anteWager) {
		// get the player's pair plus 
		boolean playPairPlus = false; // wait for them to chose
		int maxBet = Math.min(MAX_BET, playerWallet - anteWager); // set the LOGICAL max bet
		if ((playerWallet - anteWager) < MIN_BET) {
			// tell them if they don't have enough money
			System.out.println("You do not have enough money to play pair plus.");
			return 0;
		}
		if (getPairPlusChoice(in) == 1) {
			playPairPlus = true;
		} else {
			playPairPlus = false;
		}
		if (playPairPlus) {
			System.out.print("Please enter your pair plus wager ($" + MIN_BET + " min, $" + MAX_BET + " max): ");
			boolean isValidBet = false;
			while (!isValidBet) {
				try {
					int x = Integer.parseInt(in.nextLine());
					if (x >= MIN_BET && x <= maxBet) { // if the bet works
						// x >= MIN_BET && x <= playerWallet && x <= MAX_BET
						// ^ line above was the way I used to do it however I updated this to the new if
						// statement this is updated to make sure this bet works alongside the past bet (logically
						// makes sense for the player to continue playing a proper game)
						return x;
					} else {
						System.out.print("Invalid bet ($" + MIN_BET + " min, $" + MAX_BET + " max (technically $" + maxBet + " to logically continue the game), your wallet: $" + playerWallet + "): ");
					}
				} catch (Exception ex) {
					System.out.print("Invalid bet ($" + MIN_BET + " min," + MAX_BET + " max (technically $" + maxBet + " to logically continue the game): ");
				}
			}
		}
		return 0;
	}

	private static String getCard() {
		// make a card
		return getFace() + getSuit();
	}

	private static String getFace() {
		int x = (int) (Math.random() * NUM_FACES) + 2;
		// return the number, but if it's 11+, give it a letter (J,Q,K,A)
		if (x <= 10)
			return "" + x;
		else if (x == 11)
			return "J";
		else if (x == 12)
			return "Q";
		else if (x == 13)
			return "K";
		else
			return "A";
	}

	private static String getSuit() {
		// works similarly to getFace()... but only 4 possibilities (S,D,H,C)
		int x = (int) (Math.random() * NUM_SUITS);
		if (x == 0)
			return "S";
		else if (x == 1)
			return "D";
		else if (x == 2)
			return "H";
		else
			return "C";
	}

	private static int getCardValue(String card) {
		if (card.length() == 3) // 10 is the only card with length 3
			return 10;
		String face = card.substring(0, 1);
		try {
			return Integer.parseInt(face);
		} catch (Exception ex) { 
			// exceptions (use try - catch just so the program doesn't crash)
			if (face.equals("J"))
				return 11;
			if (face.equals("Q"))
				return 12;
			if (face.equals("K"))
				return 13;
			else {
				return 14;
			}
		}
	}

	private static String highestCard(String hand) {
		// get highest card
		// index of spaces in the following 3 lines
		int s1 = hand.indexOf(" ");
		int s2 = hand.indexOf(" ", s1 + 1);
		int s3 = hand.indexOf(" ", s2 + 1);
		// cards as strings
		String c1 = hand.substring(0, s1);
		String c2 = hand.substring(s1 + 1, s2);
		String c3 = hand.substring(s2 + 1, s3);

		int card1Val = getCardValue(c1);
		int card2Val = getCardValue(c2);
		int card3Val = getCardValue(c3);

		int max = Math.max(card1Val, Math.max(card2Val, card3Val));

		String jack = "jack";
		String queen = "queen";
		String king = "king";
		String ace = "ace";

		if (max == 14) {
			return ace;
		} else if (max == 13) {
			return king;
		} else if (max == 12) {
			return queen;
		} else if (max == 11) {
			return jack;
		} else {
			return max + "";
		}
	}

	private static int handType(String hand) {
		// get hand type
		// index of spaces in the following 3 lines
		int s1 = hand.indexOf(" ");
		int s2 = hand.indexOf(" ", s1 + 1);
		int s3 = hand.indexOf(" ", s2 + 1);
		// cards as strings
		String c1 = hand.substring(0, s1);
		String c2 = hand.substring(s1 + 1, s2);
		String c3 = hand.substring(s2 + 1, s3);

		int card1Val = getCardValue(c1);
		int card2Val = getCardValue(c2);
		int card3Val = getCardValue(c3);

		int max = Math.max(card1Val, Math.max(card2Val, card3Val));
		int min = -Math.max(-card1Val, Math.max(-card2Val, -card3Val));
		int mid = (card1Val + card2Val + card3Val) - (max + min);

		if (isStraightFlush(hand, max, min, mid))
			return STRAIGHT_FLUSH;
		else if (isThreeOfAKind(card1Val, card2Val, card3Val))
			return THREE_OF_A_KIND;
		else if (isStraight(hand, max, min, mid))
			return STRAIGHT;
		else if (isFlush(hand))
			return FLUSH;
		else if (isPair(card1Val, card2Val, card3Val))
			return PAIR;
		else
			return HIGH_CARD;
	}

	public static int getWinner(String playerHand, String dealerHandRevealed) {
		// see who wins (higher hand)
		// 1 = player wins
		// 2 = dealer wins
		// 3 = tie (push)
		int playerHandType = handType(playerHand);
		int dealerHandType = handType(dealerHandRevealed);
		if (playerHandType > dealerHandType) {
			return 1;
		} else if (playerHandType < dealerHandType) {
			return 2;
		} else { // both are same handType
			// if both are same hand type, whoever has the highest high-card wins
			int playerHighestCard = getMax(playerHand);
			int dealerHighestCard = getMax(dealerHandRevealed);
			if (playerHighestCard == dealerHighestCard) {
				return 3;
			} else if (playerHighestCard < dealerHighestCard) { // compare max value for each (player vs. dealer)
				return 2; // player loses; dealer wins
			}
			return 1; // player wins
		}
	}

	private static int getMax(String hand) {
		// index of spaces in the following 3 lines
		int s1 = hand.indexOf(" ");
		int s2 = hand.indexOf(" ", s1 + 1);
		int s3 = hand.indexOf(" ", s2 + 1);
		// cards as strings
		String c1 = hand.substring(0, s1);
		String c2 = hand.substring(s1 + 1, s2);
		String c3 = hand.substring(s2 + 1, s3);

		int card1Val = getCardValue(c1);
		int card2Val = getCardValue(c2);
		int card3Val = getCardValue(c3);

		int max = Math.max(card1Val, Math.max(card2Val, card3Val));

		return max;
	}

	private static boolean isPair(int card1Val, int card2Val, int card3Val) {
		// check for pair (2 same value)
		return (card1Val == card2Val || card1Val == card3Val || card2Val == card3Val);
	}

	private static boolean isFlush(String hand) {
		// check for flush (three same suit)
		char suit = hand.charAt(1);

		for (int i = 1; i < hand.length(); i += 3) {
			if (!(hand.charAt(i) == suit)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isStraight(String hand, int max, int min, int mid) { 
		// check for straight (three in a row)
		if ((hand.indexOf("A") != -1) && (hand.indexOf("2") != -1) && (hand.indexOf("3") != -1)) {
			return true;
		}
		if ((hand.indexOf("A") != -1) && (hand.indexOf("K") != -1) && (hand.indexOf("Q") != -1)) {
			return true;
		}
		if (mid - min == 1 && max - mid == 1) {
			return true;
		}
		return false;
	}

	private static boolean isThreeOfAKind(int card1Val, int card2Val, int card3Val) {
		// check for three of a kind (three same face)
		return (card1Val == card2Val && card1Val == card3Val);
	}

	private static boolean isStraightFlush(String hand, int max, int min, int mid) {
		// check for straight flush (check for combo of both straight and flush)
		return isStraight(hand, max, mid, min) && isFlush(hand);
	}

	private static boolean isUnique(String hand, String card) {
		// make sure dealt cards are not duplicates
		return hand.indexOf(card) == -1;
		for (int i = 0; i < 3; i++) {
			Boolean isDuplicate = false;
			while (!isDuplicate) {
				String card = getCard();
				if (isUnique(hand, card)) {
					hand += card + " ";
					isDuplicate = true;
				}
			}
		}
	}
}