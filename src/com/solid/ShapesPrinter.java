package com.solid;

import java.util.List;

public class ShapesPrinter {
	
	//private AreaCalculator areaCalculator = new AreaCalculator();
	private IAreaCalculator areaCalculator = new AreaCalculator();

	public ShapesPrinter(IAreaCalculator areaCalculator) {
		this.areaCalculator = areaCalculator;
	}
	public String json(List<Shape> shapes) {
		return String.format("{shapesSum: %s}", areaCalculator.sum(shapes));
	}

	public String csv(List<Shape> shapes) {
		return String.format("shapessum, %s", areaCalculator.sum(shapes));
	}

	
}
