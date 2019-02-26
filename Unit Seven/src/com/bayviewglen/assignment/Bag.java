package com.bayviewglen.assignment;

public class Bag {
	private static final int DEFAULT_CAPACITY = 10;
	private int[] data;
	private int manyItems;
	
	/* Default Constructor */
	public Bag(){
		data = new int[DEFAULT_CAPACITY];
		manyItems = 0;
	}
	
	public Bag(int capacity){
		data = new int[capacity];
		manyItems = 0;
	}
	
	// Copy Constructor - it will make a copy of the bag that got passed in
	public Bag(Bag bag){
		this.data = new int[bag.data.length];
		this.manyItems = bag.manyItems;
		for (int i = 0; i < bag.manyItems; i++){
			 this.data[i] = bag.data[i];
		}
	}
	
	public void add(int el){
		//data[manyItems++] = el;
		// is the same as
		this.data[manyItems] = el;
		manyItems++;
	}
	
	public int size(){
		return manyItems;
	}
	
	public int countOccurences(int target){
		int count = 0;
		for (int i=0;i<manyItems; i++){
			if (data[i] == target){
				count++;
			}
		}
		
		return count;		
	}
	
	public boolean remove(int target){
		for (int i=0;i<manyItems; i++){
			if (data[i] == target){
				//data[i] = data[--manyItems];
				data[i] = data[manyItems - 1];
				manyItems--;
				// or --manyItems;
				return true;
			}
		}
		
		return false;
	}
}
