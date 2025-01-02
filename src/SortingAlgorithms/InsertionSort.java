package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 45, -1, 0, 99, 888, 5, 67, 80, -3};
        System.out.println("Original array:" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
//        Algo:
//        1. Take a sub array and
//        2. insert the last element at the correct place
        int arrLength = arr.length;
        for (int i = 1; i < arrLength; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}