package me.snowlight.temperatureSensor;

public class NimbusV2TemperatureSensor extends TemperatureSensor {
    @Override
    public void read() {
        System.out.println("READ " + this.getClass().getSimpleName());
    }
}
