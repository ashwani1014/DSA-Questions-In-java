package BackTracking;
import java.util.ArrayList;
import java.util.List;

 
    
    class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, 0, current, ans);
        return ans;
    }

    private void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]);

            backtrack(nums, i + 1, current, ans);

            current.remove(current.size() - 1);
        }
    }
 
}
