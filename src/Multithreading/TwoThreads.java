package Multithreading;

//print odd and even numbers using two threads.
//1st thread prints odd
//2nd thread prints even
class Printer implements Runnable {

    static boolean printOddNum = false;
    private static final Object lock = new Object();
    private final int type;
    private int count = 0;
    public Printer(int n) {
        type = n;
        if (n == 1) count = 1;
    }

    public void printEven() {
        synchronized (lock) { //
            if (printOddNum) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + count);
                count += 2;
                printOddNum = true;
                lock.notify();
            }
        }
    }

    public void printOdd() {
        synchronized (lock) {
            if (!printOddNum) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + count);
                count += 2;
                printOddNum = false;
                lock.notify();
            }
        }
    }

    public void run() {
        if (type == 0) {
            for (int i = 0; i < 10; i++) {
                printEven();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                printOdd();
            }
        }
    }
}


public class TwoThreads {
    public static void main(String[] args) throws InterruptedException {
        Printer p1 = new Printer(1);
        Printer p2 = new Printer(0);

        Thread odd = new Thread(p1, "Thread odd ");
        Thread even = new Thread(p2, "Thread even");

        even.start();
        odd.start();

        Thread.sleep(3000);
        try {
            even.interrupt();
        } catch (Exception e){

        }
        try {
            odd.interrupt();
        } catch (Exception e){

        }

    }
}
