package Multithreading.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        //Single thread pool
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        for(int i=0; i<5; i++){
            int taskId = i;
            singleThreadPool.submit(() -> {
                System.out.printf("singleThreadPool: running task: %d using the thread: %s\n", taskId, Thread.currentThread().getName());
            });
        }

        singleThreadPool.shutdown();


        //Fixed thread pool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for(int i = 0; i<5; i++) {
            int taskId = i;
            fixedThreadPool.submit(() -> {
                System.out.printf("fixedThreadPool: running task: %d using the thread: %s\n", taskId, Thread.currentThread().getName());
            });
        }

        fixedThreadPool.shutdown();

        //Cached thread pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for(int i = 0; i<5; i++) {
            int taskId = i;
            cachedThreadPool.submit(() -> {
                System.out.printf("cachedThreadPool: running task: %d using the thread: %s\n", taskId, Thread.currentThread().getName());
            });
        }
        cachedThreadPool.shutdown();

        //Scheduled thread pool
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        for(int i = 0; i<5; i++) {
            int taskId = i;
            scheduledThreadPool.schedule(() -> {
                System.out.printf("scheduledThreadPool: running task: %d using the thread: %s\n", taskId, Thread.currentThread().getName());
            }, 5, TimeUnit.SECONDS);
        }
        scheduledThreadPool.shutdown();

    }
}
