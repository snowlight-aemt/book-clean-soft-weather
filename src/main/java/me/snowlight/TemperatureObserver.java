package me.snowlight;

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
