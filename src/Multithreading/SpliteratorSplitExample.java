package Multithreading;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorSplitExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        // Creating a Spliterator
        Spliterator<String> spliterator1 = items.spliterator();

        // Splitting it into another Spliterator
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        // Processing the first half
        System.out.println("First Spliterator:");
        spliterator1.forEachRemaining(System.out::println);

        // Processing the second half
        System.out.println("\nSecond Spliterator:");
        spliterator2.forEachRemaining(System.out::println);
    }
}
