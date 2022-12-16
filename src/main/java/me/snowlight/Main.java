package me.snowlight;

import me.snowlight.api.StationToolkit;
import me.snowlight.nimbus1_0.Nimbus1_0Toolkit;
import me.snowlight.weatherMonitoringSystem.*;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation("me.snowlight.nimbus1_0.Nimbus1_0Toolkit");
        MonitoringScreen monitoringScreen = new MonitoringScreen(weatherStation);

    }}
