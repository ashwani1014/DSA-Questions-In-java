package Recursion;

public class BinarySearch {
    

public static void main(String[]args){    
int []arr={1,5,8,9,55};
int target=0;

System.out.println(binaryrecursive(arr,target,0,arr.length-1));


}




static int binaryrecursive(int []arr,int target,int start,int end){

        if(start>end){
            return -1;
        }
         int mid=start+(end-start)/2;

         if(arr[mid]==target){
            return mid;
         }
        if (arr[mid]>target){
           return binaryrecursive(arr, target, start, mid-1);
         }

         return binaryrecursive(arr, target, mid+1, end);



}





    
}
