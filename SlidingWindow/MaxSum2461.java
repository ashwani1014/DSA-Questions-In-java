package SlidingWindow;

import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // If all elements are distinct
        if (map.size() == k) {
            ans = sum;
        }

        // Sliding window
        for (int i = k; i < nums.length; i++) {

            // Remove old element
            int remove = nums[i - k];

            sum -= remove;

            map.put(remove, map.get(remove) - 1);

            // If frequency becomes 0, remove from map
            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            // Add new element
            int add = nums[i];

            sum += add;

            map.put(add, map.getOrDefault(add, 0) + 1);

            // Check if all elements are distinct
            if (map.size() == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}
