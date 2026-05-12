public class EvenDigit{
     
    static int Even(int[] arr){
        
        int a=0;
        for(int i=0; i<arr.length;i++){
            int count=0;
            int num=arr[i];
            if(num>0){
            while(num>0){
                num=num/10;
                count++;
            }
            if(count%2==0){
                 a++;
            }
            }
      
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr={6,56,32,61,41,71,81,41};
        
         int result=Even(arr);

         
         System.out.println("Even digit number: "+result);

    }
 
}