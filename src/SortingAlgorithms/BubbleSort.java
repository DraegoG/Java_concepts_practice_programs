package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {12, 45, -1, 0, 99, 888, 5, 67, 80, -3};
        System.out.println("Original array:" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
//        Algo:
//        1. Compare the adjacent element, if the previous one is bigger
//        2. swap
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1 - i; j++) { //this condition is important
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

}