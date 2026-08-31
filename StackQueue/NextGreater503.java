import java.util.*;

public class NextGreater503 {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            Stack<Integer> stack = new Stack<>();

            // Iterate twice to simulate circular array
            for (int i = 2 * n - 1; i >= 0; i--) {
                int idx = i % n;

                // Remove smaller elements
                while (!stack.isEmpty() && stack.peek() <= nums[idx]) {
                    stack.pop();
                }

                // Set result (only during second pass)
                if (i < n) {
                    result[idx] = stack.isEmpty() ? -1 : stack.peek();
                }

                // Push current element
                stack.push(nums[idx]);
            }

            return result;
        }
    }
}
