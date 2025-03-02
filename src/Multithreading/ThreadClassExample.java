package Multithreading;

public class ThreadClassExample {
    public static void main(String[] args) {
        ThreadExtend t1 = new ThreadExtend();
        t1.start();
    }
}

class ThreadExtend extends Thread {
    public void run() {
        System.out.println("Running a thread!!!");
    }
}

