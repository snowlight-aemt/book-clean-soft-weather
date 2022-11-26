package me.snowlight;

import me.snowlight.temperatureSensor.NimbusV1TemperatureSensor;
import me.snowlight.temperatureSensor.NimbusV2TemperatureSensor;
import me.snowlight.temperatureSensor.TemperatureSensor;
import me.snowlight.temperatureSensor.TestSensor;

public class Scheduler {
    private int ticCount = 0;

    private TemperatureSensor temperatureSensor;

    private MonitoringScreen monitoringScreen;

    public Scheduler(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
        this.monitoringScreen = new MonitoringScreen();
    }

    public void tic() {
        ticCount++;
        if (ticCount < 60) return;

        double temperature = this.temperatureSensor.read();
        this.monitoringScreen.displayTemperature(temperature);

        ticCount = 0;
    }
}
