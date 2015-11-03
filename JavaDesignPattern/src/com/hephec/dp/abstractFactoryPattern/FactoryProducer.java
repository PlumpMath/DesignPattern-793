package com.hephec.dp.abstractFactoryPattern;

public class FactoryProducer {

	public AbstractFactory getFactory(String info){
		
		if(info.equals("")||info==null){
			return null;
		}
		else if(info.equals("Color")){
			//生成Color
			return new ColorFactory();
			
		}
		else if(info.equals("Shape")){
			//生成Shape
			return new ShapeFactory();
		}
		return null;
	}
}
