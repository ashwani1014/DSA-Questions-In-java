import java.util.Arrays;

public class LongestConsecutive128 {
    
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;
        int lastElement = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == lastElement+1){
                count++;
                lastElement = nums[i];
            }
            else if(nums[i] != lastElement){
                count = 1;
                lastElement = nums[i];
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
