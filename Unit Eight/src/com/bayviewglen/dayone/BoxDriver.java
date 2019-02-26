package com.bayviewglen.dayone;

public class BoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2D box1 = new Box2D(5,4);
		
		System.out.println("Area: " + box1.getArea());
		System.out.println("Perimeter: " + box1.getPerimeter());
		System.out.println("Squariness: " + box1.getSquariness());
		
		Box3D box2 = new Box3D(5,5,6);
		System.out.println("/nArea: " + box2.getArea());
		System.out.println("Perimeter: " + box2.getPerimeter());
	}
}
