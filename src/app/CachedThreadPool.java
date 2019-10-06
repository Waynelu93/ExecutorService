package app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CachedThreadpool {
    public static void CachedThreadpoolJobs (){
        long startTime = System.nanoTime();

        ExecutorService service = Executors.newCachedThreadPool();  
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("CachedThreadPool Total Time:" +  totalTime);
    }
}