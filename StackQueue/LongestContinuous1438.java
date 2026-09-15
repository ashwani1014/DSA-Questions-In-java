import java.util.ArrayDeque;
import java.util.Deque;

public class LongestContinuous1438 {
    class Solution {
        public int longestSubarray(int[] nums, int limit) {
            Deque<Integer> minDeque = new ArrayDeque<>();
            Deque<Integer> maxDeque = new ArrayDeque<>();
            int left = 0;
            int ans = 0;

            for (int right = 0; right < nums.length; right++) {

                maxDeque.offer(right);
                minDeque.offer(right);
                // maintain minDeque

                // while window is invalid
                while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {

                    minDeque.pop();

                    left++;
                }

                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }
    }
}
