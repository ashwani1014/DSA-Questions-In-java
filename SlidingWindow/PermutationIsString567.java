package SlidingWindow;

import java.util.HashMap;

public class PermutationIsString567 {

    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            HashMap<Character, Integer> map = new HashMap<>();

            int k = s1.length();

            for (int right = 0; right < s2.length(); right++) {
                char ch = s2.charAt(right);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                while (map.size() >= k) {
                    if (map.containsKey(s1)) {
                        return true;
                    }
                    map.remove(s2.charAt(right));
                }
            }
            return false;
        }
    }
}