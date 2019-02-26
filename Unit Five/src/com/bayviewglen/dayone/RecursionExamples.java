package com.bayviewglen.dayone;

public class RecursionExamples {

	static int n = 500;
	static long[] solutions = new long[n + 1];

	public static void main(String[] args) {
		System.out.println(factorial(n));
		System.out.println(fibonnaci(n));
	}

	private static long fibonnaci(int n) {
		// return nth term in the fibonnaci sequence
		if (n < 3)
			return 1;
		else if (solutions[n] != 0) // answer is stored (its not the auto filled 0
			return solutions[n];
		else {
			solutions[n] = fibonnaci(n - 2) + fibonnaci(n - 1);
			return solutions[n];
		}
	}

	private static long factorial(int n) {
		if (n < 2)
			return 1;
		else
			return n * factorial(n - 1);
	}

}
