package com.hephec.dp.prototypePattern;

import org.junit.Test;

public class PrototypePatternTest {

	@Test
	public void test() throws CloneNotSupportedException{
		
		  ShapeCache.loadCache();

	      Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape1.getType());	
	      
	      Shape clonedShape2 = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape2.getType());
	      
	      System.out.println(clonedShape1==clonedShape2);

//	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
//	      System.out.println("Shape : " + clonedShape2.getType());		
//
//	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
//	      System.out.println("Shape : " + clonedShape3.getType());
	}
}
