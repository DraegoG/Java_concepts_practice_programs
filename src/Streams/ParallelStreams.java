package Streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        //eg 1: converting a list of lowercase strings to uppercase
        List<String> lowerls = Arrays.asList("abhishek", "priyanka", "suraj", "dheeraj", "pinky", "ashutosh");
        List<String> upperls = lowerls.parallelStream()
                .map(x -> x.toUpperCase())
                .toList();

        System.out.println("original list:" + lowerls);
        System.out.println("modified list:" + upperls);

        //eg 2. finding factorial of multiple numbers
        List<Integer> intls = new LinkedList<>();
        for (int i = 0; i < 15000; i++) {
            intls.add(i);
        }

        long startTime = System.currentTimeMillis();
        List<Integer> factls = intls.parallelStream()
                .map(ParallelStreams::factorial)
                .toList();
        long endTIme = System.currentTimeMillis();

        System.out.println("time taken for the operation:" + (endTIme - startTime));
    }

    private static int factorial(int x) {
        if (x < 2) return 0;
        int ans = 1;

        for (int i = 2; i <= x; i++) {
            ans *= i;
        }

        return ans;
    }
}
