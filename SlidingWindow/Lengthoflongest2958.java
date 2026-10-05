import java.util.HashMap;

public class Lengthoflongest2958 {

    class Solution {
        public int lengthOfLongestSubarray(int[] nums, int k) {

            HashMap<Integer, Integer> freq = new HashMap<>();
            int left = 0;
            int ans = 0;

            for (int right = 0; right < nums.length; right++) {

                freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

                while (Math.abs(nums[right] - nums[left]) > k) {
                    freq.put(nums[left], freq.get(nums[left]) - 1);

                    if (freq.get(nums[left]) == 0) {
                        freq.remove(nums[left]);
                    }

                    left++;
                }

                ans = Math.max(ans, right - left + 1);
            }

            return ans;
        }
    }
}
