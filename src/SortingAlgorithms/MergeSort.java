package SortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //generating random 500 integers
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) ;
        }

        System.out.println("Original array:" + Arrays.toString(arr));
        long startTime = System.nanoTime();

        mergeSort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Sorted array:" + Arrays.toString(arr));
        System.out.println(String.format("time taken:%s ms", duration));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        // base condition
        if (l == r) {
            return;
        }

        //divide
        int mid = (l + r) / 2; //note this
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        //merge
        sortAndMerge(arr, l, mid, r);
    }

    static void sortAndMerge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1]; //note this
        int tempIndex = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[tempIndex++] = arr[left];
                left++;
            } else {
                temp[tempIndex++] = arr[right];
                right++;
            }
        }

        while (left <= mid) {
            temp[tempIndex++] = arr[left++];
        }

        while (right <= high) {
            temp[tempIndex++] = arr[right++];
        }


        if (high + 1 - low >= 0) System.arraycopy(temp, 0, arr, low, high + 1 - low);
    }
}
