import java.util.*;

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int c = 0;

        for (int i = nums.length-1; i >= 0; i--) {

            if (nums[i] < c) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                c = stack.pop();
            }

            stack.push(nums[i]);

        }

        return false;
    }
}