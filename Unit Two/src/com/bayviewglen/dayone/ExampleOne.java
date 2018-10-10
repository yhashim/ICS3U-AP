package com.bayviewglen.dayone;

public class ExampleOne {
	/* Intro to the String class */
	public static void main(String[] args) {
		// A String is a sequence of characters
		// A String of characters
		// (think of a string of beads or a sequence of beads on a String)
		
		String str = "This is a String";
		// strings are NOT primitive, they are an OBJECT TYPE
		// a string is visualized similar to an array
		// boxes for the characters
		// INDICES represent a specific character in the string for further use
		
		System.out.println(str.length());
		System.out.println(str.substring(1,4)); // to get the substring "his" from "This is a String"
								 				// [1,4) include one, exclude 4
		System.out.println(str.substring(10,str.length()));
		System.out.println(str.substring(10));
		// two ways to print "String" from String "This is a String"
		System.out.println(str.indexOf("in"));  // tells us the index of the FIRSTs occurence of this word
		System.out.println(str.indexOf("but")); // return -1 because its not there
		System.out.println(str.indexOf("IS"));  // case sensitive - won't return it
		
		String str1 = "hello";
		System.out.println(str1.compareTo("hi")); // compares to see which one is bigger (alphabetically)
												  // order of how they would be in the dictionary
		System.out.println("hi".compareTo("hi")); // return 0 because they are the same alphabetically
		
		String x = new String("hello");
		String y = new String("hello");
		
		System.out.println(x==y);
		// the == operator checks to see if what's stored for x and y is the same
		// false because the references are different (don't point to same hello)
		
		String z = "hello";		// String literals
		String zz = "hello";	// when you see a duplicate string literal, they share the same memory in Java and location
		
		System.out.println(z==zz);
		
		System.out.println(x.equals(y));	// compares the sequence of the characters, if same, true
		
		
	}

}
