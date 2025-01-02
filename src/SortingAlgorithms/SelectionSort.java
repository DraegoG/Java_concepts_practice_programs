package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {12, 45, -1, 0, 99, 888, 5, 67, 80, -3};
        System.out.println("Original array:" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {
//        Algo:
//        1. Find the minimum and
//        2. swap
        int arrayLength = arr.length;
        for (int i = 0; i <= arrayLength - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= arrayLength - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            //swap logic
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}