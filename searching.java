public class searching {
    
static boolean linearsearch(int arr[],int target){
    if(arr.length==0){
        return false;
    }

    for ( int i:arr) {
           if(i==target){
            return true;
           }
    }
    return false;


}
public static void main (String[]args){
    int[] arr={4,5,41,5,8,2,6,4,6,22};
         
    boolean a=linearsearch(arr,2);
     System.out.println(a);

}



}
