package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// looking at printf (something that prints with formatting)
		// lets us do things that println can't do
		
		int x = 317;
		System.out.println("The number chosen is: " + x);
		System.out.printf("The number chosen is: %d\n", x); // does the same thing
		
		int a = 10;
		int b = 17;
		int sum = a + b;
		
		System.out.println(a + " + " + b + " = " + sum); 
		// printed what we wanted using string concatenation
		System.out.printf("%d + %d = %d\n", a, b, sum);
		// tells us to print the three integers in place of the int place-holders
		
		double c = 10.25;
		double d = 17.45;
		double sum2 = c + d;
		System.out.printf("%f", sum2);	
		// %f is the double/float place holder
		System.out.printf("%.1f", sum2); 
		// .1 tells us to give only 1 thing to the right of the dot (only 1 decimal point)
		System.out.printf("%10.1f\n", sum2); 
		// place-holder is for a floating point number where the width is 10 and has one decimal place		
		System.out.printf("%-10.1f\n", sum2); // the minus aligns it to the left
		
		// right align an int with a width of 15
		int z = 67;
		System.out.printf("%15d\n", z);
		
		int minutes = 5;
		double seconds = 10.35;
		
		System.out.printf("%d:%06.3f\n", minutes, seconds);
		
		int y = 1234567890;
		System.out.printf("%,d", y);
		
	}

}
