package me.snowlight.temperatureSensor;

import me.snowlight.StationToolkit;

public class Nimbus1_0Toolkit implements StationToolkit {
    @Override
    public TemperatureSensorImp makeTemperature() {
        return new NimbusV1TemperatureSensor();
    }
}
