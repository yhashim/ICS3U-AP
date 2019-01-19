package com.bayviewglen.dayone;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// && is and - already know that too but whatever
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && false: " + (false && false));
		// line 9-10 = deadcode, because false is already determined
		// short circuited expression - knows enough about the expression, doesn't need rest
		
		// || is or - already know that but its ok
		System.out.println("\n\ntrue || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));
		// Line 16-17 is deadcode
		// any time we use && or ||, we have a compound expression (things joined together)
		
		System.out.println("\n\n!true:" + !true);
		System.out.println("!false:" + !false);

	}

}
