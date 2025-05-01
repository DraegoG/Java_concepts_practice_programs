package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Inside completable future");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello world";
        });

        CompletableFuture<Void> cf2 = CompletableFuture.runAsync(() -> {
            System.out.println("running cf2");
        });

        Thread.sleep(1000);
        System.out.println("After completable future");
        System.out.println("Result of completable future:" + cf1.get()); //waits for 3 seconds
        System.out.println("Result of completable future 2:" + cf2.get()); //returns null

        CompletableFuture<Integer> comp1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        }).thenApply(k -> k * 10);

        CompletableFuture<Integer> comp2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 2;
        }).thenApply(k -> k * 10);

        CompletableFuture<Integer> comp3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 3;
        }).thenApply(k -> k * 10);

        CompletableFuture<Void> cf3 = CompletableFuture.allOf(comp1, comp2, comp3);

        cf3.join(); //halts the main method till all the futures inside cf3 are completed

        AtomicInteger finalSum = new AtomicInteger();
        cf3.thenRun(() -> {
            try {
                finalSum.addAndGet(comp1.get());
                finalSum.addAndGet(comp2.get());
                finalSum.addAndGet(comp3.get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Final sum :" + finalSum);

        System.out.println("Ending the program");

    }
}
