package com.fssa.corejava.day02.solved;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCalculator calculator = new ShapeCalculator();
		double circleArea = calculator.calculateArea(3.5); // Output: 38.48451000647496
		double rectangleArea = calculator.calculateArea(4.2, 6.8); // Output: 28.559999999999995
		System.out.println(circleArea);
		System.out.println(rectangleArea);
	}

}
