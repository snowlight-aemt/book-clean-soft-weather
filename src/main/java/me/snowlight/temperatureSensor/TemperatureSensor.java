package me.snowlight.temperatureSensor;

import me.snowlight.Observable;

public abstract class TemperatureSensor extends Observable {
    protected double temperature;
    private AlarmClock alarmClock;

    public TemperatureSensor(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    public void run() {
        this.alarmClock.wakeEvent(1000, this::check);
    }

    protected void check() {
        double val = read();
        if (temperature != val) {
            temperature = val;
            notice();
        }
    }

    public abstract double read();
}
