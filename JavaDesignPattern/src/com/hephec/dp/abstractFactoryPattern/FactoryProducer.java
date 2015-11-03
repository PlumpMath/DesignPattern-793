package com.hephec.dp.abstractFactoryPattern;

public class FactoryProducer {

	public AbstractFactory getFactory(String info){
		
		if(info.equals("")||info==null){
			return null;
		}
		else if(info.equals("Color")){
			//����Color
			return new ColorFactory();
			
		}
		else if(info.equals("Shape")){
			//����Shape
			return new ShapeFactory();
		}
		return null;
	}
}
