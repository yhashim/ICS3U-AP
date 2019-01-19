package com.bayviewglen.dayfour;

public class ECOOWordFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "CANADA";

		// top
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
			System.out.print(word);
			System.out.print("*");
			System.out.println("");
		}
		// middle
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
			for (int j = 0; j < word.length(); j++) {
				System.out.print("*");
			}
			System.out.println(word.charAt(word.length() - 1 - i));
			
		}
		// base
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
			System.out.print(word);
			System.out.print("*");
		}

	}

}
