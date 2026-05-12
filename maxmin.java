public class maxmin{

public static int max (int []arr)
{
    int max=Integer.MAX_VALUE;

    for (int i : arr) {
        if(i<max){
            max=i;
        }
        }
        return max;

        
     
}
    public static void main(String[]args){
        int []arr={10,5,7,8,1,0};
        int maximum=max(arr);
        System.out.println(maximum);


    }









}