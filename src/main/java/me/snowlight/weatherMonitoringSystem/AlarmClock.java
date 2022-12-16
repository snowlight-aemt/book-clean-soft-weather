package me.snowlight.weatherMonitoringSystem;

import me.snowlight.api.AlarmClockListener;

import java.util.HashMap;
import java.util.Map;

public class AlarmClock {

    Map<AlarmClockListener, Integer> listeners = new HashMap<>();

//    Integer previousTime;

    public void clockPulse() {
//        previousTime += LocalDateTime.now().getSecond();
//
//        listeners.forEach((listener, interval) -> {
//            if (previousTime >= interval / 1000) {
//                listener.wakeUp();
//            }
//        });
    }

    public void wakeEvent(int interval, AlarmClockListener listener) {
        listeners.put(listener, interval);
        listener.wakeUp();
//        while (true) {
//            try {
//                Thread.sleep(interval);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            listener.wakeUp();
//        }
    }
}
