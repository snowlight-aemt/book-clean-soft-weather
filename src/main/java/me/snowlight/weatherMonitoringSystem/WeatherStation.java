package me.snowlight.weatherMonitoringSystem;

import me.snowlight.api.StationToolkit;
import me.snowlight.nimbus1_0.Nimbus1_0Toolkit;

public class WeatherStation {
    public static void main(String[] args) {

        StationToolkit stationToolkit = new Nimbus1_0Toolkit();
        TemperatureSensor temperatureSensor = new TemperatureSensor(new AlarmClock(), stationToolkit);
        new MonitoringScreen(temperatureSensor);
        temperatureSensor.run();

//        TemperatureSensor temperatureSensor = new TemperatureSensor(new AlarmClock(), new NimbusV1TemperatureSensor());
//        new MonitoringScreen(temperatureSensor);
//        temperatureSensor.run();
    }
}
