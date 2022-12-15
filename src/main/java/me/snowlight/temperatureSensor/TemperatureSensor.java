package me.snowlight.temperatureSensor;

import me.snowlight.Observable;

public class TemperatureSensor extends Observable {
    protected double temperature;
    private AlarmClock alarmClock;

    private TemperatureSensorImp temperatureSensorImp;

    public TemperatureSensor(AlarmClock alarmClock, TemperatureSensorImp temperatureSensorImp) {
        this.alarmClock = alarmClock;
        this.temperatureSensorImp = temperatureSensorImp;
    }

    public void run() {
        this.alarmClock.wakeEvent(1000, this::check);
    }

    protected void check() {
        double val = temperatureSensorImp.read();
        if (temperature != val) {
            temperature = val;
            notice();
        }
    }

    @Override
    public double getValue() {
        return this.temperature;
    }
}
