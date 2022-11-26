package me.snowlight;

import me.snowlight.temperatureSensor.NimbusV1TemperatureSensor;
import me.snowlight.temperatureSensor.NimbusV2TemperatureSensor;
import me.snowlight.temperatureSensor.TemperatureSensor;
import me.snowlight.temperatureSensor.TestSensor;

public class Scheduler {
    private int ticCount = 0;

    private TemperatureSensor temperatureSensor;

    public Scheduler(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    public void tic() {
        ticCount++;
        if (ticCount < 60) return;

        this.temperatureSensor.read();

        ticCount = 0;
    }
}
