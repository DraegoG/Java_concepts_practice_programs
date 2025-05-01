package ComparatorAndComparableExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//it is used to compare and sort different objects by defining a comparator object
public class ComparatorExample {

    public static void main(String[] args) {
        //Case: For a given integer list of 2 digit integers, sort the list using the integer in 1's place
        //Sol. Using Comparator
        Comparator<Integer> com = new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                // think in terms of the selection sort i.e. if the first element is bigger then swap(return 1)
                if (a % 10 > b % 10) {
                    return 1; //means swap
                } else {
                    return -1;
                }
            }
        };

        List<Integer> ls = Arrays.asList(23, 56, 65, 76, 34, 42, 89, 90, 11);

        Collections.sort(ls, com);

        System.out.println(ls);
    }

}
