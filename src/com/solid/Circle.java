package com.solid;

public class Circle  implements Shape{
	private final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	/*//Circle is 2D shape, it cannot calculate volume
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	} */
}
