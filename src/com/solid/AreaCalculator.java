package com.solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
	
	@Override
	public int sum(List<Shape> shapes) {
		int sum =0;
		for(int i=0; i<shapes.size(); i++) {
			Shape shape = shapes.get(i);
			sum += shape.area();	
		}
		return sum;
	}

	/* Removed as its violating Single responsibility 
	public String json(int sum) {
		return String.format("{shapesSum: %s}", sum);
	}

	public String csv(int sum) {
		return String.format("shapessum, %s", sum);
	}
*/

	
}
