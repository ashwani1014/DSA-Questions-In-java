// "CyclicSort FOR Question given 1 to N range "

package Sorting;

import java.util.Arrays;

public class Cyclicsort{



 public static void cyclicsort(int []arr){

    int i=0;
    while(i<arr.length){
      int correct=arr[i]-1;
      
      if(arr[i]!=arr[correct]){
        swap_array(arr,i,correct);
      }
      else{
        i++;
      }
        
    }
 }   

    static void swap_array(int[] arr, int start, int second) {
        
            int temp = arr[start];
            arr[start] = arr[second];
            arr[second] = temp;
        
    }

    public static void main(String[] args) {
        int[] arr = { 4,5,1,2,3,8,6,7 };
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }

 




}