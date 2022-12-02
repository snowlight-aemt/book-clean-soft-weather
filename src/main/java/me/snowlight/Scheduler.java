package me.snowlight;

import me.snowlight.temperatureSensor.TemperatureSensor;

public class Scheduler {

    private TemperatureSensor temperatureSensor;

    public Scheduler(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    public void start() {
        for (int i = 0; i < 120; i++) {
            this.temperatureSensor.read();

            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
