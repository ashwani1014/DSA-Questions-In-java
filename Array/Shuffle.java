package Array;

public class Shuffle {
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int even = 0;
        int odd = 1;

        for(int i = 0; i < n; i++) {
            ans[even] = nums[i];      
            ans[odd] = nums[i + n];   

            even += 2;
            odd += 2;
        }

        return ans;
    }
}
    
}
