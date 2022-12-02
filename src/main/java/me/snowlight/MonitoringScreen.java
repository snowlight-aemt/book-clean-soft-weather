package me.snowlight;

public class MonitoringScreen {
    public MonitoringScreen(Observable observable) {
        observable.add(new TemperatureObserver(this));
    }

    public void displayTemperature(double temperature) {
        System.out.println("Display Temperature ");
        System.out.println("--- " + temperature + " ---");
    }

    public void displayPressure(double pressure) {
        System.out.println("Display Temperature ");
        System.out.println("--- " + pressure + " ---");
    }
}
