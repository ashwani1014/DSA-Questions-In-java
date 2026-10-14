public class MinimumArray2856 {
    class Solution {
        public int minOperations(int[] nums) {

            int n = nums.length;
            int left = 0;
            int right = n - 1;

            int ops = 0;

            while (left < right) {

                if (nums[left] < nums[right]) {
                    right--;
                    ops++;
                } else if (nums[left] > nums[right]) {
                    left++;
                    ops++;
                } else {
                    left++;
                    right--;
                }
            }

            return ops;
        }
    }
}
