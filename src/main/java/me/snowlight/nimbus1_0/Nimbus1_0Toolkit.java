package me.snowlight.nimbus1_0;

import me.snowlight.api.StationToolkit;
import me.snowlight.api.TemperatureSensorImp;

public class Nimbus1_0Toolkit implements StationToolkit {
    @Override
    public TemperatureSensorImp makeTemperature() {
        return new NimbusV1TemperatureSensor();
    }
}
