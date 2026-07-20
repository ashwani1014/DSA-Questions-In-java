package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        helper(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }

    static void helper(int index,
            int[] candidates,
            int target,
            List<Integer> current,
            List<List<Integer>> ans) {

        // Base Case 1
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Base Case 2
        if (index == candidates.length) {
            return;
        }

        // ---------------- TAKE ----------------
        if (target >= candidates[index]) {

            current.add(candidates[index]);

            helper(index,
                    candidates,
                    target - candidates[index],
                    current,
                    ans);

            // Backtracking
            current.remove(current.size() - 1);
        }

        // ---------------- SKIP ----------------
        helper(index + 1,
                candidates,
                target,
                current,
                ans);
    }
}
 
