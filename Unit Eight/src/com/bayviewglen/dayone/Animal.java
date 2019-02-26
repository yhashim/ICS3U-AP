package com.bayviewglen.dayone;

public abstract class Animal {
	private int weight;
	private String name;
	
	// abstract means we know they will have these methods
	// but we don't know how to code it yet
	// this means you must make the class also abstract
	// because the code is not finished
	// therefore calling new Animal is not possible
	public abstract void makeNoise();
	
	public int getWeight() {
		return weight;
	}
	public void updateWeight(int delta) {
		weight+=delta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void play();
	
	public void eat(int amount) {
		weight+=amount/3;
	}
	
}
