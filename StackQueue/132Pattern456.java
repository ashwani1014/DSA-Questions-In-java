import java.util.*;

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int j = 0;
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            stack.push(nums[i]);

            while (j < 2 && stack.size() >= 1) {
                a = stack.pop();

                if (i + 1 < nums.length) {
                    b = nums[i + 1];
                }

                if (i + 2 < nums.length) {
                    c = nums[i + 2];
                }

                if (a < c && c < b) {
                    return true;
                }

                j++;
            }

            j = 0;
        }

        return false;
    }
}