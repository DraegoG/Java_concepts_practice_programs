package Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Simulating the behaviour that if one thread has acquired the lock another thread will wait only for a certain
time duration to get the lock
 */
public class ReentrantLocksExample {

    public static void main(String[] args) {

        BankBalance hdfc = new BankBalance();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                hdfc.withdraw(50);
            }
        };

        Thread t1 = new Thread(r1, "ram");
        Thread t2 = new Thread(r1, "suresh");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        hdfc.printBalance();
    }
}


class BankBalance {
    int accountBalance = 100;
    Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw");
        try {
            if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
                try {
                    if (accountBalance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        accountBalance -= amount;
                        System.out.println("Deducted amount:" + amount + " the remaining balance is:" + accountBalance);
                    } else {
                        System.out.println("Insufficient balance in the account");
                    }
                } catch (Exception e) {

                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Not able to get the lock, will retry later");
            }
        } catch (Exception e){

        }
    }

    public void printBalance(){
        System.out.println("The current account balance is:" + accountBalance);
    }
}
