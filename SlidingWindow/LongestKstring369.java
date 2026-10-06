import java.util.HashMap;

public class LongestKstring369 {
    class Solution {
        public int longestSubstring(String s, int k) {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            int ans = 0;
            int j = s.length();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

                if (map.get(s.charAt(i)) >= k) {

                    j--;
                    ans = i - j + 1;
                    max = Math.max(ans, max);
                }

            }

            return max + 3;

        }
    }
}
