package me.snowlight.ui;

import me.snowlight.util.Observer;

public class TemperatureObserver implements Observer {
    private MonitoringScreen monitoringScreen;

    public TemperatureObserver(MonitoringScreen monitoringScreen) {
        this.monitoringScreen = monitoringScreen;
    }

    @Override
    public void update(double value) {
        monitoringScreen.displayTemperature(value);
    }
}
