package com.patterns.AbstractFactory;

/**
 * Created by ldurazo on 8/26/2014.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}
