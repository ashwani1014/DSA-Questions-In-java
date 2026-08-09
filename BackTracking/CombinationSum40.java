package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum40 {
    class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          List<List<Integer>> ans=new ArrayList<>();
          Arrays.sort(candidates);
        helper(candidates, target, ans, 0, new ArrayList<>());
        return ans;
    }
    public void helper(int [] nums,int target,List<List<Integer>> ans,int index,List<Integer> path){

        if(target==0){
            ans.add(new ArrayList<>(path));
        return;
        }

        for (int i = index; i < nums.length; i++) {
          

        if(i>index && nums[i]==nums[i-1])
        {
            continue;
        }  
        if (nums[i] > target)
            continue;

        // Choose
        path.add(nums[i]);

        // Explore
       helper(nums, target - nums[i], ans, i+1, path);
        
        // Undo
        path.remove(path.size() - 1);
    }

}
}
}
