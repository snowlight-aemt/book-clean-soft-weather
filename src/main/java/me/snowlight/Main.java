package me.snowlight;

import me.snowlight.temperatureSensor.NimbusV2TemperatureSensor;

public class Main {
    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler(new NimbusV2TemperatureSensor());

        for (int i = 0; i < 120; i++) {
            scheduler.tic();

            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
