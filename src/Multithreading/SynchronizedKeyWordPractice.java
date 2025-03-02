package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedKeyWordPractice {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i<5; i++) {
            executorService.submit(() -> sharedResource.incrementCounterMethod()); //using lambda expression
            executorService.submit(sharedResource::incrementCounterBlock); //using shorthand notation
        }

        executorService.shutdown();
    }
}

class SharedResource {
    int count = 0;

    public synchronized void incrementCounterMethod() {

        System.out.println("Inside incrementCounterMethod, Current thread name:" + Thread.currentThread().getName() + "counter value:" + count);
        count++;
        System.out.println("Inside incrementCounterMethod, Current thread name:" + Thread.currentThread().getName() + "counter incremented:" + count);
    }

    public void incrementCounterBlock(){
        System.out.println(Thread.currentThread().getName() + " is trying to enter incrementBlock");
        synchronized (this) {
            System.out.println("Inside incrementCounterBlock, Current thread name:" + Thread.currentThread().getName() + "counter value:" + count);
            count++;
            System.out.println("Inside incrementCounterBlock, Current thread name:" + Thread.currentThread().getName() + "counter incremented:" + count);
        }
    }
}
