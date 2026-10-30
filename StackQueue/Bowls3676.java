class Solution {
    public long bowlSubarrays(int[] nums) {
        int n = nums.length;
        int[] stack = new int[n];
        int top = -1;
        long count = 0;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && nums[stack[top]] < nums[i]) {
                int j = stack[top--];

                if (i - j >= 2) {
                    count++;
                }
            }

            if (top >= 0 && i - stack[top] >= 2) {
                count++;
            }

            stack[++top] = i;
        }

        return count;
    }
}