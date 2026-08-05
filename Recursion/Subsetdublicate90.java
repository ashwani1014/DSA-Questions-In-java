package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsetdublicate90 {
    class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        solve(0, nums, path, ans);

        return ans;
    }

    void solve(int index, int[] nums,
            List<Integer> path,
            List<List<Integer>> ans) {


         ans.add(new ArrayList<>(path));
         for (int i = index; i < nums.length; i++) {
        if (i > index && nums[i] == nums[i - 1])
            continue;

        // Include
        path.add(nums[i]);
        solve(i + 1, nums, path, ans);

        // Backtrack
        path.remove(path.size() - 1);

        // Exclude
        
         }
    }
}
}
