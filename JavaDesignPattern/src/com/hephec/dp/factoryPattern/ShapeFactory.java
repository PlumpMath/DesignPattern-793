package com.hephec.dp.factoryPattern;


public class ShapeFactory {

	static ShapeEnum shapeEnum=null;
	static Shape shape=null;
	
	public static Shape getShape(ShapeEnum shapeEnum){
		
		switch(shapeEnum){
		
			case CIRCLE:shape=new Cirle();break;
			case SQUARE:shape=new Square();break;
			case RECTANGLE:shape=new Rectangle();break;
		}
		
		return shape;
		
	}
}
