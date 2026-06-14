package Leetcode;
class Solution {
    public int MissingNumber(int[] nums) {
         int i=0;
       while(i<nums.length){
       int correct=nums[i];
       if(nums[i]<nums.length&&nums[i]!=nums[correct]){
        swap_array(nums,i,correct);
      }
      else{
        i++;
      }
 }

    for(int index=0;index<nums.length;index++){
    if(nums[index]!=index){
    return index;
    }
     }
    return nums.length;

    
    }

      static void swap_array(int[] arr, int start, int second) {
        
            int temp = arr[start];
            arr[start] = arr[second];
            arr[second] = temp;
        
    }
}