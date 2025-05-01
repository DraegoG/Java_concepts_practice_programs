package Multithreading.Locks;

//print odd and even numbers using two threads.
//1st thread prints odd
//2nd thread prints even

//concept:
//Two threads can use the same object and call wait() to pause its execution and notify() to resume the other thread
//the wait and notify is done based on a common variable here its printOddNum
class NumPrinter {

    private boolean printOddNum = true;

    public synchronized void printOdd(int number) throws InterruptedException {
        if (!printOddNum) {
            System.out.println("odd: Will wait");
            wait();
        }
        System.out.println(number);
        printOddNum = false;
        notify();
    }

    public synchronized void printEven(int number) throws InterruptedException {
        if (printOddNum) {
            System.out.println("even: Will wait");
            wait();
        }
        System.out.println(number);
        printOddNum = true;
        notify();
    }

}


public class TwoThreads {
    public static void main(String[] args) throws InterruptedException {
        NumPrinter p1 = new NumPrinter();
        int n = 10;

        Thread odd = new Thread(() -> {
            for (int i = 1; i < n; i += 2) {
                try {
                    p1.printOdd(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread odd");

        Thread even = new Thread(() -> {
            for (int i = 2; i <= n; i += 2) {
                try {
                    p1.printEven(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread even");

        even.start();
        odd.start();

    }
}
