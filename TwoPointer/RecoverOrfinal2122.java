
import java.util.*;

class Solution {
    public int[] recoverArray(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int m = n / 2;

        for (int j = 1; j < n; j++) {
            int diff = nums[j] - nums[0];

            // Difference must be positive and even
            if (diff <= 0 || diff % 2 != 0) {
                continue;
            }

            int k = diff / 2;

            int[] ans = new int[m];
            boolean[] used = new boolean[n];

            int left = 0;
            int right = 0;
            int idx = 0;

            while (left < n && right < n) {
                if (used[left]) {
                    left++;
                    continue;
                }

                if (right <= left) {
                    right = left + 1;
                }

                while (right < n &&
                        (used[right] || nums[right] - nums[left] < 2 * k)) {
                    right++;
                }

                if (right == n) {
                    break;
                }

                if (nums[right] - nums[left] == 2 * k) {
                    ans[idx++] = nums[left] + k;
                    used[left] = true;
                    used[right] = true;
                    left++;
                    right++;
                } else {
                    left++;
                }

                if (idx == m) {
                    return ans;
                }
            }
        }

        return new int[0];
    }
}
