package me.snowlight.weatherMonitoringSystem;

import me.snowlight.util.Observable;
import me.snowlight.api.StationToolkit;
import me.snowlight.api.TemperatureSensorImp;

public class TemperatureSensor extends Observable {
    protected double temperature;
    private AlarmClock alarmClock;

    private TemperatureSensorImp temperatureSensorImp;

    public TemperatureSensor(AlarmClock alarmClock, StationToolkit stationToolkit) {
        this.alarmClock = alarmClock;
        this.temperatureSensorImp = stationToolkit.makeTemperature();
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
