package com.bayviewglen.dayone;

// Box2D is the parent (base-class) of Box3D
// Box3D is the child (sub-class) of Box2D
public class Box3D extends Box2D {
	private double depth;

	public Box3D(double width, double length, double depth) {
		super(width, length); // super is our parent
		// you must call the parent constructor
		// first in your code, if you do at all
		this.depth = depth;
		//Box3D justin = new Box3D(0,0,0);
	}
	
	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getSA() {
		// return (2*(this.getWidth()*this.getDepth()) + 2*(this.getLength()*this.getDepth()) + 2*(this.getDepth()*this.getWidth()));
		return super.getArea()*2 + depth*(getLength()+getWidth())*2;
	}
	
	public double getVolume() {
		return super.getArea()*depth;
	}
}
