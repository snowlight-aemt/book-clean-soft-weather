package me.snowlight.temperatureSensor;

import me.snowlight.Observable;

public abstract class TemperatureSensor extends Observable {
    public abstract void start();
    public abstract double read();
}
