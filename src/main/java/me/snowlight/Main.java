package me.snowlight;

import me.snowlight.temperatureSensor.NimbusV1TemperatureSensor;
import me.snowlight.temperatureSensor.TemperatureSensor;

public class Main {
    public static void main(String[] args) {

        TemperatureSensor temperatureSensor = new NimbusV1TemperatureSensor();

        MonitoringScreen monitoringScreen = new MonitoringScreen(temperatureSensor);
        new Scheduler(temperatureSensor).start();

//        Scheduler scheduler = new Scheduler(new NimbusV2TemperatureSensor());
//
//        for (int i = 0; i < 120; i++) {
//            scheduler.tic();
//
//            try {
//                Thread.sleep(50L);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
