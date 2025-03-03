package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        //1. Filter even numbers from a list: print and save in another list
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> evenNumList = listOfNumbers.stream().filter(element -> (element % 2 == 0)).collect(Collectors.toList());
        System.out.println("even num list:" + evenNumList);

        //2. convert a list of strings to uppercase
        List<String> lowerCaseStringList = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        List<String> upperCaseStringList = lowerCaseStringList
                .stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("upper case list:" + upperCaseStringList);

        //3. How to sort a list using Streams
        List<Integer> sortedList_asc = listOfNumbers
                .stream()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> sortedList_desc = listOfNumbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        //4. How to remove duplicate elements from a list
        List<Integer> uniqueList = listOfNumbers
                .stream()
                .distinct()
                .collect(Collectors.toList());

        //5. How to find the maximum and minimum numbers from a list
        //6. How to count elements greater than 5
        long countOfNumbers = listOfNumbers
                .stream()
                .filter(element -> element > 5)
                .count();
        System.out.println("Number of integers greater than 5:" + countOfNumbers);

        //7. How to join list elements into a single string
        //8. How to convert List to Map
        //9. How to find the first element greater than 10
        //10. How to sum all numbers in the list
        //11. How to check if any number is greater than 50
        //12. How to limit the number of elements in the stream
        //13. How to skip the first 3 elements
        //14. How to group elements by length
        //15. Sum of all numbers in the linkedlist
        int sum = listOfNumbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("sum of all elements: " + sum);

    }
}
