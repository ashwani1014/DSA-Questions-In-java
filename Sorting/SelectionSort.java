package Sorting;

import java.util.Arrays;

class SelectionSort {

    static int max(int []arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static void Selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = max(arr, 0, last);
            swap_array(arr, max, last);
        }
    }

    static void swap_array(int[] arr, int start, int second) {
        
            int temp = arr[start];
            arr[start] = arr[second];
            arr[second] = temp;
        
    }

    public static void main(String[] args) {
        int[] arr = { 24, 5, 7, 1, 3, 4 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }

}