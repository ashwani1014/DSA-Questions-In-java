import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWIndow239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int ans[] = new int[6];
            Deque<Integer> dq = new ArrayDeque<>();

            for (int i = 0; i < nums.length; i++) {

                // Remove elements outside window
                while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                    dq.pollFirst();
                }

                // Maintain decreasing order
                while (!dq.isEmpty() &&
                        nums[dq.peekLast()] <= nums[i]) {
                    dq.pollLast();
                }

                dq.offerLast(i);

                // Window complete
                if (i >= k - 1) {
                    ans[i - k + 1] = nums[dq.peekFirst()];
                }
            }
            return ans;
        }
    }
}
