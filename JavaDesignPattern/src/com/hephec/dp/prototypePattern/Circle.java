package com.hephec.dp.prototypePattern;

public class Circle extends Shape {

	public Circle() {
		type="Circle";
	}
	@Override
	void draw() {
		System.out.println("draw Circle");
	}

}
