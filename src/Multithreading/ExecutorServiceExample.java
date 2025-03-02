package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> {
            System.out.println("running thread 1");
        });

        executorService.submit(() -> {
            System.out.println("running thread 2");
        });

        executorService.submit(() -> {
            System.out.println("running thread 3");
        });

        executorService.shutdown();
    }
}
