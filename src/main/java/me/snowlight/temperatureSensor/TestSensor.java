package me.snowlight.temperatureSensor;

public class TestSensor extends TemperatureSensor {
    @Override
    public void read() {
        System.out.println("READ " + this.getClass().getSimpleName());
    }
}
