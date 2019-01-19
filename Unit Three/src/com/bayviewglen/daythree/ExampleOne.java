package com.bayviewglen.daythree;

public class ExampleOne {
	/* Investigate for loops
	 * for loops are counting loops
	 */
	public static void main(String[] args) {
		// use for loops when we need to iterate something a number of times
		// repeats as long as a condition is true
		// initialize counter, make condition with counter, and increment the counter in the paranthesis
		for (int i = 0; i<10; i++) {
			System.out.println(i);
		} 
		
		System.out.println("-----------------------------");
		// to print even numbers
		for (int i = 0; i<10; i++){
			if (i%2==0)
				System.out.println(i);
		}
		
		System.out.println("-----------------------------");
		// MORE EFFIECIENT to print even numbers
		for (int i = 0; i<10; i+=2){
			if (i%2==0)
				System.out.println(i);
		}
		
		System.out.println("-----------------------------");
		int i = 0;
		while (i<10) { // while loops are not normally used for counters like for loops but they can be used
			System.out.println(i);
			i+=2;
		}

	}

}
