package Collections;

import java.util.LinkedList;
import java.util.List;

public class QueueImplementationUsingLinkedList {
    public static void main(String[] args) {
        QueueUsingLinkedList<String> q = new QueueUsingLinkedList<>();
        q.add("Abhishek");
        q.add("ram");

        System.out.println("First element in queue:" + q.peek());
        System.out.println("Removing first element in queue:" + q.poll());
        System.out.println("First element in queue:" + q.peek());
    }
}

class QueueUsingLinkedList<T> {
    //poll
    //peek
    //add

    List<T> queue;

    public QueueUsingLinkedList() {
        queue = new LinkedList<>();
    }

    public List<T> getQueue() {
        return queue;
    }

    public void add(T element) {
        queue.add(element);
    }

    public T peek() {
        return queue.get(0);
    }

    public T poll() {
        return queue.remove(0);
    }
}