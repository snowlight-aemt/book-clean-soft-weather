package me.snowlight.util;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    protected void notice() {
        for (Observer observer : observers)
            observer.update(getValue());
    }

    public abstract double getValue();
}
