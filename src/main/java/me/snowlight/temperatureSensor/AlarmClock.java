package me.snowlight.temperatureSensor;

import me.snowlight.AlarmClockListener;

public class AlarmClock {
    public void wakeEvent(int interval, AlarmClockListener listener) {
        while (true) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            listener.wakeUp();
        }
    }
}
