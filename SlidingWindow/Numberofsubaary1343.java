package SlidingWindow;

public class Numberofsubaary1343 {

    class Solution {
        public int numOfSubarrays(int[] arr, int k, int threshold) {

            int prefixSum = 0;
            int count = 0;

            // first window
            for (int i = 0; i < k; i++) {
                prefixSum += arr[i];
            }

            if (prefixSum / k >= threshold) {
                count++;
            }

            // slide
            for (int i = k; i < arr.length; i++) {

                prefixSum += arr[i] - arr[i - k];

                if (prefixSum / k >= threshold) {
                    count++;
                }
            }

            return count;
        }
    }
}
