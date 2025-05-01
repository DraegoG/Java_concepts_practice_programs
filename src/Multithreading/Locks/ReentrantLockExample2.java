package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Goal is to display how a reentrant lock works: i.e. it keeps a track of the number of times a lock was
acquired by a thread

 We'll take an example of a person(thread) entering a house with a lock and then entering the washroom(acquiring lock again)
 Hence while coming out of the house it tries to unlock twice
 */
public class ReentrantLockExample2 {
    public static void main(String[] args) {
        House house1 = new House();

        house1.enterHouse();
        System.out.println("Main method completed");
    }

    static class House {

        Lock lock = new ReentrantLock();

        public void enterHouse() {
            try {
                System.out.println(Thread.currentThread().getName() + " entering the house");
                lock.tryLock();
                enterWashroom();
            } catch (Exception e) {
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " exiting the house");
            }
        }

        private void enterWashroom() {
            try {
                lock.tryLock();
                System.out.println(Thread.currentThread().getName() + " entering the washroom");
            } catch (Exception e) {
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() +" exiting the washroom");
            }
        }
    }
}
