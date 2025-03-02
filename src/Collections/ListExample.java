package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("arrayList size:" + arrayList.size() + " arraylist:" + arrayList);
        System.out.println("linkedlist size:" + linkedList.size() + " linkedList:" + linkedList);

        //Sorting a list in descending order
        //1. Using Collections.sort()
        List<Integer> unorderedList = new ArrayList<>(Arrays.asList(3, 7, 3, 4, 7, 9, 0, 2, 1, 6));
        Collections.sort(unorderedList); //Ascending
        System.out.println("Sorted unorderedList list:" + unorderedList);
        Collections.sort(unorderedList, Comparator.reverseOrder()); //Descending
        System.out.println("Sorted unorderedList list:" + unorderedList);


        //2. Using streams
        List<Integer> unorderedList1 = new ArrayList<>(Arrays.asList(3, 7, 3, 4, 7, 9, 0, 2, 1, 6));
        unorderedList1
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        //3. Using Comparator Interface
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(25, 5, 15, 50, 10));

        System.out.println("Before Sorting: " + list);

        list.sort((a, b) -> b - a); // Descending Order using Lambda

        System.out.println("After Sorting (Descending): " + list);
    }
}
