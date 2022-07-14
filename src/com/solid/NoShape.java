package com.solid;

public class NoShape implements Shape {

	@Override
	public double area() {
		throw new IllegalStateException("Can not calcualate area for NoShape");
	}

}
