package DP;

import java.util.Arrays;

public class HouseRobber198 {
    class Solution {

    int[] dp;

    public int rob(int[] nums) {

        dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return solve(0, nums);
    }

    public int solve(int i, int[] nums) {

        if (i >= nums.length)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int take = nums[i] + solve(i + 2, nums);

        int notTake = solve(i + 1, nums);

        dp[i] = Math.max(take, notTake);

        return dp[i];
    }
}
}
