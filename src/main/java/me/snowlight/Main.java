package me.snowlight;

import me.snowlight.temperatureSensor.*;

import java.lang.reflect.InvocationTargetException;

public class Main {
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
