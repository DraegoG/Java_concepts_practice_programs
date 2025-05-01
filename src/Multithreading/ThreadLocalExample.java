package Multithreading;

public class ThreadLocalExample {


    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 using the threadlocal");

            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 2 using the threadlocal");

            }
        };

        Thread t1 =  new Thread(r1);
        Thread t2 =  new Thread(r2);


    }


    private static class SharedResource{
        ThreadLocal<String> threadLocalVar = new ThreadLocal<>();
    }
}


