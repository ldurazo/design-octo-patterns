package com.patterns.FactoryPattern;


public class ShapeFactory {
    //Factory is one of the best ways to create an object, without exposing the logic of the objects but by using a
    //common interface.
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
