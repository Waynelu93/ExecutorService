package app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;

public class App {
    public static void main(String[] args) throws Exception {
        CachedThreadpool.CachedThreadpoolJobs();
        FixedThreadPool.FixedThreadPoolJobs();
        ScheduleThreadPool.ScheduleThreadPoolJobs();
    }
}
