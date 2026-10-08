class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int currlength = 0;

        if (nums.length < 3) {
            return 0;
        }

        for (int i = 2; i < nums.length; i++) {

            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                currlength++;
                count = currlength + count;
            } else {
                currlength = 0;
            }

        }

        return count;
    }

}