package Sorting;

import java.util.Arrays;

public class BubbleSort {


    static void Bubble(int arr[]){
  
    for(int i=0;i<arr.length;i++){
 boolean swap=false;
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
         swap=true;
                
            }

           
            }
              if(!swap){
                 break;
        }
    }
    }
    
        public static void main(String[]args){


            int []arr={1,5,8,6,-1,-3};
            Bubble(arr);
            System.out.println(Arrays.toString(arr));
        }


}
