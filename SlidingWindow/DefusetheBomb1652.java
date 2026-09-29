package SlidingWindow;

public class DefusetheBomb1652 {
    class Solution {
        public int[] decrypt(int[] code, int k) {

            int[] arr = new int[code.length];
            if (k == 0) {
                return arr;
            }

            int left = 0;

            for (int right = 0; right < code.length; right++) {

                int count = 0;
                int sum = 0;

                while (count < Math.abs(k)) {
                    if (k > 0) {
                        sum += code[(right + count + 1) % code.length];
                    } else {
                        sum += code[(right - count - 1 + code.length) % code.length];
                    }
                    count++;
                }
                arr[right] = sum;

            }

            return arr;
        }
    }
}
