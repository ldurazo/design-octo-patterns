package com.patterns.AbstractFactory;

/**
 * Created by ldurazo on 8/26/2014.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
