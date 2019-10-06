package app;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduleThreadPool {
    public static void ScheduleThreadPoolJobs() {
        long startTime = System.nanoTime();
        
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        for(int i = 0; i < 100; i++) {
            service.schedule(new Task(), 10, TimeUnit.SECONDS);
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("ScheduleThreadPool Total Time: " + totalTime);
    }
}