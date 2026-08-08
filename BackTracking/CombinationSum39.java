package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
           List<List<Integer>> ans=new ArrayList<>();
        helper(candidates, target, ans, 0, new ArrayList<>());
        return ans;
    }

   public void helper(int [] nums,int target,List<List<Integer>> ans,int index,List<Integer> path){

        if(target==0){
            ans.add(new ArrayList<>(path));
        return;
        }
        for (int i = index; i < nums.length; i++) {

        if (nums[i] > target)
            continue;

        // Choose
        path.add(nums[i]);

        // Explore
       helper(nums, target - nums[i], ans, i, path);
        
        // Undo
        path.remove(path.size() - 1);
    }

    }
}
}
