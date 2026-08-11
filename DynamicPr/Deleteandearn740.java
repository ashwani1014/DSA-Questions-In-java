package DynamicPr;
import java.util.Arrays;

public class Deleteandearn740 {
    class Solution {

    public int deleteAndEarn(int[] nums) {

        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] earn = new int[max + 1];

        for (int num : nums) {
            earn[num] += num;
        }

        int[] dp = new int[max + 1];
        Arrays.fill(dp, -1);

        return solve(earn, max, dp);
    }

    int solve(int[] earn, int i, int[] dp) {

        if (i == 0)
            return 0;

        if (i == 1)
            return earn[1];

        if (dp[i] != -1)
            return dp[i];

        int take = earn[i] + solve(earn, i - 2, dp);
        int skip = solve(earn, i - 1, dp);

        return dp[i] = Math.max(take, skip);
    }
}
}
