package com.dpattern.factory;

public class FactoryClass {
    public Object getShapeInstances(String value){
        return  switch (value.trim().toLowerCase()){
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            default -> "Invalid input";
        };
    }
}
