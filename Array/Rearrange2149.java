class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=0;
        int k=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[j]=nums[i];
                j=j+2;
            }
             else{
                arr[k]=nums[i];
                k=k+2;
            }
        }
        return arr;
    }
}