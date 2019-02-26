package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleFour {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("Red");
		words.add("Green");
		words.add("Yellow");
		words.add(1, "Purple");
		
		System.out.println("The words: " + words);
		System.out.println("Size: " + words.size());
		
		String oldColour = words.set(0, "Pink");
		System.out.println("\nRemoved: " + oldColour);
		System.out.println("The words: " + words);
		System.out.println("Size: " + words.size());
		
		oldColour = words.remove(1);
		System.out.println("\nRemoved: " + oldColour);
		System.out.println("The words: " + words);
		System.out.println("Size: " + words.size());

	}

}
