package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 45, -1, 0, 99, 888, 5, 67, 80, -3};
        System.out.println("Original array:" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int low, int high) {
//        Algo:
//        1. Decide a pivot
//        2. Start pointers from left and right
//        3. Keep sorting
//        4. Replace the pivot with the value of right pointer
        if (low < high) {
            int partitionedIndex = returnPartitionedIndexAfterSorting(arr, low, high);
            quickSort(arr, low, partitionedIndex - 1);
            quickSort(arr, partitionedIndex + 1, high);
        }
    }

    private static int returnPartitionedIndexAfterSorting(int[] arr, int low, int high) {
        int pivot = low;
        int left = low;
        int right = high;
        while (left < right) {
            while ((arr[pivot] >= arr[left]) && left < high) {
                left++;
            }
            while ((arr[pivot] < arr[right]) && right > low) {
                right--;
            }
            if (left < right) swap(arr, left, right);
        }
        swap(arr, pivot, right);

        return right;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}