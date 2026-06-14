package Sorting;

import java.util.Arrays;

public class NewSort {
    
static void InsertionSort(int []arr){

    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
              swap_array(arr,j,j-1);
            }
            else{
                break;
            }
        }
    }

}


    static void swap_array(int[] arr, int start, int second) {
        
            int temp = arr[start];
            arr[start] = arr[second];
            arr[second] = temp;
        
    }




  public static void main(String[] args) {
        int[] arr = { 24, 5, 7, 1, 3, 4 };
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

 






}
