package com.bayviewglen.dayone;

public class Dog extends Animal {
	
	public Dog(String name) {
		setName(name);
		updateWeight(10);
	}
	
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Woof... woof");		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Yeet~");
		updateWeight(-2);
	}
	
}
