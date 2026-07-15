package Array;

import java.util.ArrayList;

// LeetCode 1389: Create Target Array in the Given Order
class Shift1389 {

    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int a = index[i];
            target.add(a, nums[i]);
        }

        int[] ans = new int[target.size()];

        for (int i = 0; i < target.size(); i++) {
            ans[i] = target.get(i);
        }

        return ans;
    }
}