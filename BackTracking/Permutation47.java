package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation47 {
    class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);          // Sort first
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> curr) {

        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used in current permutation
            if (used[i]) continue;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, used, curr);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
}
