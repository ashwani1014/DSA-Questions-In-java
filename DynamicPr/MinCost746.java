package DynamicPr;

import java.util.Arrays;

public class MinCost746 {
 

    int[] dp;

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        dp = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(solve(0, cost), solve(1, cost));
    }

    public int solve(int i, int[] cost) {

        if (i >= cost.length)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        dp[i] = cost[i] + Math.min(
                solve(i + 1, cost),
                solve(i + 2, cost));

        return dp[i];
    }
}
 
