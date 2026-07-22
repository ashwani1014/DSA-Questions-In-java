package Recursion;

public class TargetSum494 {
    
    public int findTargetSumWays(int[] nums, int target) {
            
         int index=0;
         int sum=0;


         return helper(nums,target,index,sum);
  }


public static int helper(int[] nums, int target, int index, int sum){
    if (index==nums.length){
        if(target==sum){
            return 1;
        }
        return 0;
    }
 int plus=helper(nums,target,index+1,sum+nums[index]);
 int minus=helper(nums,target,index+1,sum-nums[index]);

 return plus+minus;


}

          

            

   
}
 
