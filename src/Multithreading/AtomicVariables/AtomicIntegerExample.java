package Multithreading.AtomicVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    public static void main(String[] args) throws InterruptedException {
        SharedResource sr = new SharedResource();

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            for(int i=0; i<50000; i++) {
                sr.increment();
            }
            System.out.println("Thread 1 completed");
        });


        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            for(int i=0; i<50000; i++) {
                sr.increment();
            }
            System.out.println("Thread 2 completed");
        });

        t1.start();
        t2.start();

        Thread.sleep(3000);
        System.out.println("Count value:" + sr.getCountValue());

    }

    private static class SharedResource {
        private AtomicInteger count = new AtomicInteger(0);

        public void increment (){
            count.incrementAndGet();
        }

        public int getCountValue(){
            return count.get();
        }
    }
}


