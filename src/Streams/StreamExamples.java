package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        //1. Filter even numbers from a list: print and save in another list
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 21, 3, 14, 15, 6, 17, 28, 89, 10));
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
        Optional<Integer> max = listOfNumbers
                .stream()
                .max(Integer::compareTo);

        Optional<Integer> min = listOfNumbers
                .stream()
                .min(Integer::compareTo);

        //6. How to count elements greater than 5
        long countOfNumbers = listOfNumbers
                .stream()
                .filter(element -> element > 5)
                .count();
        System.out.println("Number of integers greater than 5:" + countOfNumbers);

        //7. How to join list elements into a single string
        List<String> stringList = new ArrayList<>(Arrays.asList("abc", "bcd", "cde", "def"));
        String combinedList = stringList.stream()
                .reduce("", (a,b) -> {
                   return a+b;
                });
        System.out.println("CombinedList:" + combinedList);

        //8. How to convert List to Map

        //9. How to find the first element greater than 10
        Integer firstNumGT10 = listOfNumbers.stream()
                .filter(x -> x>10)
                .findFirst()
                .get();

        System.out.println("First element greater than 10:" + firstNumGT10);


        //10. How to sum all numbers in the list
        int totalSum = listOfNumbers.stream()
                .reduce(0, (a,b) -> a+b);
        //11. How to check if any number is greater than 50
        //12. How to limit the number of elements in the stream
        //13. How to skip the first 3 elements
        //14. How to group elements by length
        //15. Sum of all numbers in the linkedlist
        int sum = listOfNumbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("sum of all elements: " + sum);

    }
}
