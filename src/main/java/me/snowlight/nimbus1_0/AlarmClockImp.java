package me.snowlight.nimbus1_0;

import me.snowlight.api.ClockListener;
import me.snowlight.weatherMonitoringSystem.AlarmClock;

public class AlarmClockImp implements me.snowlight.api.AlarmClockImp {
    @Override
    public void register(ClockListener clockListener) {
        Runnable runnable = () -> {
            try {
                while (true) {
                    Thread.sleep(10);
                    clockListener.tic();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}

