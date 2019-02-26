package com.bayviewglen.dayone;

public class Cat extends Animal {
	
	public Cat(String name) {
		setName(name);
		updateWeight(10);
	}
	
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Meow~");		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Scratch Sally.");
		updateWeight(-1);
	}
}
