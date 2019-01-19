package com.bayviewglen.daythree;

public class ExampleFour {
	// Display a 10 x 30 grid of dots
	public static void main(String[] args) {
		final int NUM_ROWS = 10;
		final int NUM_COLS = 30;
		
		for (int j = 0; j<NUM_ROWS; j++) {
			// build a row of dots
			for (int i = 0; i<NUM_COLS; i++) {
				System.out.print(".");
			}
			System.out.println();
		}

	}

}
