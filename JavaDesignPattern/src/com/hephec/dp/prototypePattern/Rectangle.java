package com.hephec.dp.prototypePattern;

public class Rectangle extends Shape {

	public Rectangle() {
		type="Rectangle";
	}
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}

}
