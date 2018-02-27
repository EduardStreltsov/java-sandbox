package com.oop_design_patterns.factory;

public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();
        shape1 = shapeFactory.getShape("square");
        shape1.draw();
    }
    
}
