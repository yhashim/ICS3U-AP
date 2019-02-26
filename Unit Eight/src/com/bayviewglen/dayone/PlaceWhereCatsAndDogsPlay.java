package com.bayviewglen.dayone;

public class PlaceWhereCatsAndDogsPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal thing = new Animal(); Cannot instantiate an abstract class
		
		Dog puppy = new Dog("Coco");
		Cat strayCat = new Cat("Scrawny Cat");
		puppy.eat(6);
		strayCat.eat(1);
		
		puppy.play();
		strayCat.play();
		
		puppy.makeNoise();
		strayCat.makeNoise();
		
		// POLYMORPHISM
		Animal poly = new Cat("Happy cat");
		poly.eat(5);
		poly.play(); /* dynamic binding (it doesn't know which version of the method 
				      * to use, so it binds the method implementation at runtime)
				      */
		poly = new Dog("Bigger than the Cat");
		poly.play();
		
	}

}
