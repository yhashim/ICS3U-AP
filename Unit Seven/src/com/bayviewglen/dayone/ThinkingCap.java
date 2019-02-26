package com.bayviewglen.dayone;

public class ThinkingCap {
	// variables define the state of the object: our thinking cap
	// static means that this belongs to the class, not to any specific object
	// it is shared by all the objects
	private String redWords;
	private String greenWords;
	
	/*
	 * if you do not create a constructor, Java will
	 * supply you with one that does NOTHING!
	 * the one it supplies takes NO arguments
	 */
	
	public ThinkingCap() {
		// no argument constructor = default constructor
		redWords = "";
		greenWords = "";
	}
	
	public ThinkingCap(String greenWords, String redWords) {
		this.redWords = redWords;
		this.greenWords = greenWords;
		// "this" refers to this instance (whatever object)
	}
	
	// public methods define the behaviour of the object: our thinking cap
	public String pushRed() {
		return redWords;
	}
	
	public void insertRed(String redMsg) {
		redWords = redMsg;
	}
	
	public String pushGreen() {
		return greenWords;
	}
	
	public void insertGreen(String greenMsg) {
		greenWords = greenMsg;
	}
}
