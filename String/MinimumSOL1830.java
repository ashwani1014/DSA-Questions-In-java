package String;
import java.util.Arrays;

public class MinimumSOL1830 {
    

  

    public int makeStringSorted(String s) {

        char[] arr = s.toCharArray();

        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);

        int count = 0;

        while (!Arrays.equals(arr, sorted)) {

            previousPermutation(arr);
            count++;
        }

        return count;
    }

    private void previousPermutation(char[] arr) {

        int i = arr.length - 2;

        while (i >= 0 && arr[i] <= arr[i + 1]) {
            i--;
        }

        if (i < 0) return;

        int j = arr.length - 1;

        while (arr[j] >= arr[i]) {
            j--;
        }

        swap(arr, i, j);

        reverse(arr, i + 1, arr.length - 1);
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(char[] arr, int l, int r) {

        while (l < r) {
            swap(arr, l++, r--);
        }
    }
}
 
