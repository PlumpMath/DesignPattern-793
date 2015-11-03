package com.hephec.dp.factoryPattern;

import org.junit.Test;

public class FactoryPatternTest {
	
	@Test
	public void test(){
		
		Shape shapeC=ShapeFactory.getShape(ShapeEnum.CIRCLE);
		System.out.println(shapeC.getClass());
		Shape shapeR=ShapeFactory.getShape(ShapeEnum.RECTANGLE);
		System.out.println(shapeR.getClass());
		Shape shapeS=ShapeFactory.getShape(ShapeEnum.SQUARE);
		System.out.println(shapeS.getClass());
	}
}
