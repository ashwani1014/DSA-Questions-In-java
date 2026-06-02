package Array;

import java.util.ArrayList;

public class leetcode1365 {

     
    public int[] smallerNumbersThanCurrent(int[] nums) {
     ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
            if(nums[i]>nums[j]){
                count++; 
            }
              
        }
        ans.add(count); 
        }




        int[] res = new int[ans.size()];

for(int i = 0; i < ans.size(); i++) {
    res[i] = ans.get(i);
}

return res;

 

    }
}
    
 
