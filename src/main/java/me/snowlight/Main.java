package me.snowlight;

import me.snowlight.temperatureSensor.NimbusV1TemperatureSensor;
import me.snowlight.temperatureSensor.TemperatureSensor;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor temp = new NimbusV1TemperatureSensor();
        temp.read();
    }
}
