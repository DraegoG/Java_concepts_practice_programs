package Multithreading;

public class RunnableInterfaceExample implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<5; i++) {
            System.out.println("running thread!!! using interface, thread name:" + Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableInterfaceExample r1 = new RunnableInterfaceExample();
        RunnableInterfaceExample r2 = new RunnableInterfaceExample();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t1.join(); // waits for this thread to finish execution
        t2.start();
    }
}
