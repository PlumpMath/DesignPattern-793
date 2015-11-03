package com.hephec.dp.abstractFactoryPattern;

import org.junit.Test;

public class AbstractFactoryPatternTest {

	@Test
	public void test(){
		
		FactoryProducer producer=new FactoryProducer();
		AbstractFactory afColor=producer.getFactory("Color");
		Color green=afColor.getColor("green");
		System.out.println(green.getClass().getName());
		
		AbstractFactory afShape=producer.getFactory("Shape");
		Shape circle=afShape.getShape("circle");
		System.out.println(circle.getClass().getName());
	}
	
	
}
