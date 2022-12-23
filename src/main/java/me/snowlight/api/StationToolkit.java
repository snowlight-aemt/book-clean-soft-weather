package me.snowlight.api;

public interface StationToolkit {
    public TemperatureSensorImp makeTemperature();
    public AlarmClockImp getAlarmClock();

}
