package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleOne {

	public static void main(String[] args) {
		// an ArrayList is a list which can hold pretty much everything
		// it must store object-types 
		// (e.g. it cannot hold ints, but you can use Integer objects)
		// the array list is a list implemented using an array
		// has benefits over using arrays - all the tedious things you had to do before are already done for you with methods
			// you can add items to specific index and shift stuff over
			// you can remove items from the list
			// you can replace/set an element at an index
			// size of list
			// get elements
		// the size of the ArrayList is dynamic
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		// when constructing, we state what object-type we are using within <>
		ints.add(6); // adds 6 to the end of the ArrayList
		ints.add(1, 8); // adds the number 8 to the index 1 and shifts other nums down, starting from the end
		
		System.out.println("Size: " + ints.size());
		
		ints.add(7);
		ints.add(10);
		ints.add(-6);
		
		System.out.println(ints);
		
		System.out.println("Size: " + ints.size());
		// this doesn't mean that the array size is this
		
	}

}
