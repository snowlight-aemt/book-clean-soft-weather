package me.snowlight.ui;

import me.snowlight.weatherStationComponent.WeatherStationComponent;

public class MonitoringScreen {
    public MonitoringScreen(WeatherStationComponent wsc) {
        wsc.addTempObserver(new TemperatureObserver(this));
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
