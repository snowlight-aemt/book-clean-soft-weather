package me.snowlight.weatherMonitoringSystem;

import me.snowlight.api.StationToolkit;
import me.snowlight.api.TemperatureSensorImp;
import me.snowlight.util.Observable;

public class TemperatureSensor extends Observable {
    protected double temperature;
    private AlarmClock alarmClock;

    private TemperatureSensorImp temperatureSensorImp;

    public TemperatureSensor(AlarmClock alarmClock, StationToolkit stationToolkit) {
        this.alarmClock = alarmClock;
        this.temperatureSensorImp = stationToolkit.makeTemperature();

        this.alarmClock.wakeEvent(1000, this::check);
    }

    protected void check() {
        double val = read();
        if (temperature != val) {
            temperature = val;
            notice();
        }
    }

    private double read() {
        return temperatureSensorImp.read();
    }

    @Override
    public double getValue() {
        return this.temperature;
    }
}
