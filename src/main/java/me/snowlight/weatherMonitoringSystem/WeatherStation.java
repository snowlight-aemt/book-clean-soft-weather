package me.snowlight.weatherMonitoringSystem;

import me.snowlight.api.StationToolkit;
import me.snowlight.util.Observer;
import me.snowlight.weatherStationComponent.WeatherStationComponent;

import java.lang.reflect.InvocationTargetException;

public class WeatherStation implements WeatherStationComponent {
    TemperatureSensor temperatureSensor;

    public WeatherStation(String tkName) {
        try {
            StationToolkit stationToolkit = (StationToolkit) Class.forName(tkName).getConstructor().newInstance();
            this.temperatureSensor = new TemperatureSensor(new AlarmClock(stationToolkit), stationToolkit);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void addTempObserver(Observer o) {
        this.temperatureSensor.add(o);
    }
}
