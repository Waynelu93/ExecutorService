package app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class FixedThreadPool {
    public static void FixedThreadPoolJobs() {
        long startTime = System.nanoTime();

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("FixedThreadPool Total Time:" +  totalTime);        
    }
}