package me.snowlight;

import me.snowlight.temperatureSensor.TemperatureSensorImp;

public interface StationToolkit {
    public TemperatureSensorImp makeTemperature();

}
