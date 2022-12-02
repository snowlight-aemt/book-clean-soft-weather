package me.snowlight.temperatureSensor;

import me.snowlight.Observable;

public abstract class TemperatureSensor extends Observable {
    public abstract double read();
}
