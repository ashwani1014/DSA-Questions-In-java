package SlidingWindow;

public class Substring1876 {

    class Solution {
        public int countGoodSubstrings(String s) {

            int k = 3;
            int count = 0;

            for (int i = 0; i <= s.length() - k; i++) {

                char ch1 = s.charAt(i);
                char ch2 = s.charAt(i + 1);
                char ch3 = s.charAt(i + 2);

                if (ch1 != ch2 && ch2 != ch3 && ch1 != ch3) {
                    count++;
                }
            }
            return count;
        }
    }

}
