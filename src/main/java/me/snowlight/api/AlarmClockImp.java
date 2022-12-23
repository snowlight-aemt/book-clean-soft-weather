package me.snowlight.api;

import me.snowlight.weatherMonitoringSystem.AlarmClock;

public interface AlarmClockImp {
    public void register(ClockListener clockListener);
}
