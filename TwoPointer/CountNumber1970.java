
class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // Remove subarray from i to j
                boolean increasing = true;
                int prev = -1;

                for (int k = 0; k < n; k++) {
                    // Skip the subarray being removed
                    if (k >= i && k <= j) {
                        continue;
                    }

                    if (prev != -1 && nums[k] <= nums[prev]) {
                        increasing = false;
                        break;
                    }

                    prev = k;
                }

                if (increasing) {
                    count++;
                }
            }
        }

        return count;
    }
}
