package SlidingWindow;

import java.util.HashMap;

public class LongestKstring369 {
    class Solution {
        public int longestSubstring(String s, int k) {

            int max = 0;

            for (int distinct = 1; distinct <= 26; distinct++) {

                HashMap<Character, Integer> map = new HashMap<>();

                int j = 0;
                int unique = 0;
                int valid = 0;

                for (int i = 0; i < s.length(); i++) {

                    char ch = s.charAt(i);

                    // Add right character
                    if (!map.containsKey(ch)) {
                        unique++;
                    }

                    map.put(ch, map.getOrDefault(ch, 0) + 1);

                    // Character reaches k
                    if (map.get(ch) == k) {
                        valid++;
                    }

                    // Shrink window
                    while (unique > distinct) {

                        char left = s.charAt(j);

                        if (map.get(left) == k) {
                            valid--;
                        }

                        map.put(left, map.get(left) - 1);

                        if (map.get(left) == 0) {
                            map.remove(left);
                            unique--;
                        }

                        j++;
                    }

                    // Valid window
                    if (unique == distinct && valid == distinct) {
                        max = Math.max(max, i - j + 1);
                    }
                }
            }

            return max;
        }
    }
}