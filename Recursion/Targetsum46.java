package Recursion;

import java.util.ArrayList;
import java.util.List;

 
    class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
      if(nums.isEmpty()){
        ans.add(ans);
        return list;
      }

      for(int  i=0;i<nums.length-1;i++){
       permute(nums);
       
      }


      return ans;




    }
}
