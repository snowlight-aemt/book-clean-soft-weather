package me.snowlight;

import me.snowlight.temperatureSensor.AlarmClock;
import me.snowlight.temperatureSensor.NimbusV1TemperatureSensor;
import me.snowlight.temperatureSensor.TemperatureSensor;

public class Main {
    public static void main(String[] args) {
        // Client
        TemperatureSensor temperatureSensor = new NimbusV1TemperatureSensor(new AlarmClock());
        new MonitoringScreen(temperatureSensor);
        temperatureSensor.start();
    }
}
