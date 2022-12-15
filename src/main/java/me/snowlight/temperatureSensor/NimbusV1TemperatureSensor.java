package me.snowlight.temperatureSensor;

import java.util.Random;

public class NimbusV1TemperatureSensor implements TemperatureSensorImp {

    @Override
    public double read() {
        System.out.println("READ " + this.getClass().getSimpleName());
        return (double) new Random().nextInt(10);
    }

}
