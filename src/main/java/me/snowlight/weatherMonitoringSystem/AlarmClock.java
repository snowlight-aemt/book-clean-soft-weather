package me.snowlight.weatherMonitoringSystem;

import me.snowlight.api.AlarmClockImp;
import me.snowlight.api.ClockListener;
import me.snowlight.api.StationToolkit;

import java.util.HashMap;
import java.util.Map;

public class AlarmClock {

    private final AlarmClockImp alarmClockImp;
    Map<AlarmListener, Integer> listeners = new HashMap<>();

    public AlarmClock(StationToolkit stationToolkit) {
        this.alarmClockImp = stationToolkit.getAlarmClock();
        alarmClockImp.register(new ClockListener() {
            @Override
            public void tic() {
                AlarmClock.this.clockPulse();
            }
        });
    }

    // TODO 현재는 interval 를 적용하지 못한다...;
    public void clockPulse() {
        listeners.forEach((listener, interval) -> {
            listener.wakeUp();
        });
    }

    public void wakeEvent(int interval, AlarmListener listener) {
        listeners.put(listener, interval);
    }
}
