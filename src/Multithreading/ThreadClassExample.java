package Multithreading;

public class ThreadClassExample {
    public static void main(String[] args) {
        ThreadExtend t1 = new ThreadExtend();
        Thread t2 = new Thread(() ->
        {
            System.out.println("Running from thread object t2");
        }
        );
        t1.start();
        t2.start();
    }
}

class ThreadExtend extends Thread {
    public void run() {
        System.out.println("Running a thread!!!");
    }
}

