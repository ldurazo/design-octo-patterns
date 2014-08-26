package com.patterns.ObservablePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ldurazo on 8/25/2014.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int State;

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
