package com.solid;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IAreaCalculator areaCalculator = new AreaCalculator();
		IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
		Circle circle = new Circle(10);
		Square square = new Square(10);
		Cube cube = new Cube();
		
		Rectangle rectangle = new Rectangle();
		
		NoShape noshape = new NoShape();
		
		ShapesPrinter printer = new ShapesPrinter(areaCalculatorV2);
		
		//List<Shape> shapes = List.of(circle, square, cube, rectangle, noshape);
		List<Shape> shapes = List.of(circle, square, cube, rectangle);
		int sum = areaCalculator.sum(shapes);
		
				
		System.out.println(printer.json(shapes));
		System.out.println(printer.csv(shapes));

	}

}
