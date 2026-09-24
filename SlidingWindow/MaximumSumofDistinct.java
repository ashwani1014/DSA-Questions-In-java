package SlidingWindow;

import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long ans = 0;

        Set<Integer> set = new HashSet<>();

        // First window
        for (int i = 0; i < k; i++) {
            set.add(nums[i]);
            sum += nums[i];
        }

        if (set.size() == k) {
            ans = sum;
        }

        // Sliding window
        for (int i = k; i < nums.length; i++) {

            // Remove old element
            sum -= nums[i - k];
            set.remove(nums[i - k]);

            // Add new element
            sum += nums[i];
            set.add(nums[i]);

            // Check distinct
            if (set.size() == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}
