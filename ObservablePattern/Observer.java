package com.patterns.ObservablePattern;

/**
 * Created by ldurazo on 8/25/2014.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
