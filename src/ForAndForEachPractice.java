import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForAndForEachPractice {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        //printing using enhance for loop
        System.out.println("Printing using enhanced for loop");
        for (int i : arr) {
            System.out.println("i:" + i);
        }

        //printing using forEach METHOD
        System.out.println("Printing using enhanced forEach() method");
        arr.forEach(element -> {
            System.out.println("element:" + element);
        });
    }
}
