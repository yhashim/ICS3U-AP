package com.bayviewglen.dayfour;
// shortcut assignment operators
public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		// ++ x calculates x+1 before it prints
		// x++ calculates after 
		// same with --
		
		int y = 6;
		
		System.out.println(y);
		int z = ++y + 10;
		// using ++ modifies y permanently
		// however y+1 only modifies y temporarily
		
		System.out.println(y);
		System.out.println(z);
		
		// x++ and ++x is the same as x = x+1;
		
		x = x + 17;
		
		// faster ways...
		x += 17;
		x -= 17;
		
		x *= 17;
		x /= 17;
		
		x %= 17;
		
		// we can TRACE the code to go through and see the steps the console and memory go through in the code
		
	}

}
