package Sorting;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        arr = mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {

        // Base Case
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // Left Half
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        // Right Half
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge Both Sorted Arrays
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }

            k++;
        }

        // Remaining elements of first array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Remaining elements of second array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}