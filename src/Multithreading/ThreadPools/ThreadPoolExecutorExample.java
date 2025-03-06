package Multithreading.ThreadPools;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                5,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2)
        );

        for (int i=0; i<5; i++){
            int taskId = i;
            threadPoolExecutor.submit(() -> {
                System.out.printf("Adding task: %d to thread pool\n", taskId);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        threadPoolExecutor.shutdown();
    }
}
