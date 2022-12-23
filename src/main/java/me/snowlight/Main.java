package me.snowlight;

import me.snowlight.ui.MonitoringScreen;
import me.snowlight.weatherMonitoringSystem.WeatherStation;
import me.snowlight.weatherStationComponent.WeatherStationComponent;

public class Main {
    public static void main(String[] args) {
        WeatherStationComponent weatherStationComponent =
                new WeatherStation("me.snowlight.nimbus1_0.Nimbus1_0Toolkit");

        MonitoringScreen monitoringScreen = new MonitoringScreen(weatherStationComponent);
    }}
