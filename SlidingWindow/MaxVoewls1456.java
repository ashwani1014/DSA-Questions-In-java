package SlidingWindow;

import java.util.HashSet;

public class MaxVoewls1456 {
    class Solution {
        public int maxVowels(String s, int k) {

            HashSet<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');

            int count = 0;
            int maxCount = 0;

            // Initial window
            for (int i = 0; i < k; i++) {
                if (vowels.contains(s.charAt(i))) {
                    count++;
                }
            }
            maxCount = count;

            // Sliding
            for (int i = k; i < s.length(); i++) {

                if (vowels.contains(s.charAt(i))) {
                    count++;
                }

                if (vowels.contains(s.charAt(i - k))) {
                    count--;
                }

                maxCount = Math.max(maxCount, count);
            }

            return maxCount;
        }
    }
}
