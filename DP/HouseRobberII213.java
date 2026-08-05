package DP;

import java.util.Arrays;

public class HouseRobberII213 {
    class Solution {
    int dp[];

    public int helper(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int take = nums[i] + helper(nums, i + 2);
        int nottake = helper(nums, i + 1);

        return dp[i] = Math.max(take, nottake);

    }

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int[] nums1 = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            nums1[i] = nums[i];
        }
        dp = new int[nums1.length];
        Arrays.fill(dp, -1);
        int ans1 = helper(nums1, 0);

        int[] nums2 = new int[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            nums2[i - 1] = nums[i];
        }

        dp = new int[nums2.length];
        Arrays.fill(dp, -1);
        int ans2 = helper(nums2, 0);

        return Math.max(ans1, ans2);

    }
}
}
