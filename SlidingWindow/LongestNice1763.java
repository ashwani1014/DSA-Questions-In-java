public class LongestNice1763 {
    class Solution {
        public String longestNiceSubstring(String s) {
            String ans = "";
            for (int right = 0; right < s.length() - 1; right++) {

                if (s.charAt(right) - s.charAt(right + 1) == 0 ||
                        s.charAt(right) - s.charAt(right + 1) == 32 ||
                        s.charAt(right) - s.charAt(right + 1) == -32) {

                    ans = ans + s.charAt(right + 1);
                }

            }
            return ans;
        }
    }
}
