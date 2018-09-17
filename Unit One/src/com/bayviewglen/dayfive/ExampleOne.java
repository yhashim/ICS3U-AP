package com.bayviewglen.dayfive;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 110;
		int y = 123;
		
		double answer = 0.8957;
		// round to three decimal places
		System.out.println((Math.round(answer*1000))*0.001);
		
		System.out.printf("%5.3f", answer);
		// print f is printing with formating
		// print f takes the variables and replaces it with things to the left
		// with a percent it knows we have something special
		// 5 tells us we have 5 character/spots and the 3 tells us the decimal points
		// f tells us its a floating point

	}

}
