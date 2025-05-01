package Multithreading.Locks;

public class UsingJoinInThreads {
    public static void main(String[] args) {

        Thread t1 = new Thread(() ->
        {
            System.out.println("Starting thread t1");
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Simulating some work of t1");
                    Thread.sleep(3000);
                }
                System.out.println("Work done by: t1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() ->
        {
            System.out.println("Starting thread t2");
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Simulating some work of t2");
                    Thread.sleep(3000);
                }
                System.out.println("Work done by: t2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        try {
            t1.join(); //main will wait for t1 to finish
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start(); //main won't wait for t2 to finish. It will just start t2 and move on

        System.out.println("Main finished execution");
    }
}
