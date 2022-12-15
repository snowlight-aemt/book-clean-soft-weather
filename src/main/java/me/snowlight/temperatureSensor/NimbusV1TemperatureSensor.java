package me.snowlight.temperatureSensor;

import java.util.Random;

public class NimbusV1TemperatureSensor extends TemperatureSensor {
    public NimbusV1TemperatureSensor(AlarmClock alarmClock) {
        super(alarmClock);
    }

    @Override
    public double read() {
        System.out.println("READ " + this.getClass().getSimpleName());
        return (double) new Random().nextInt(10);
    }

    @Override
    public double getValue() {
        return temperature;
    }
}
