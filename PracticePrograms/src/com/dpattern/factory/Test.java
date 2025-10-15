package com.dpattern.factory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        FactoryClass object = new FactoryClass();
        Shape shape = (Shape)object.getShapeInstances(value);
        shape.computeArea();
    }
}
