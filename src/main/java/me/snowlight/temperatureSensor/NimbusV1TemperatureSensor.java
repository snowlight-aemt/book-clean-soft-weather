package me.snowlight.temperatureSensor;

import java.util.Random;

public class NimbusV1TemperatureSensor extends TemperatureSensor {
    private double temperature;
    private AlarmClock alarmClock;

    public NimbusV1TemperatureSensor(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    @Override
    public void start() {
        alarmClock.wakeEvent(1000, () -> {
            if (temperature != read()) {
                temperature = read();
                notice();
            }
        });
    }

    @Override
    public double read() {
        System.out.println("READ " + this.getClass().getSimpleName());
        return (double) new Random().nextInt(10);
    }

    @Override
    public double getValue() {
        return this.temperature;
    }
}
