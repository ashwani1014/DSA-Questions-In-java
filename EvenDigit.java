public class EvenDigit{
     
    static boolean Even(int number){
        int count=0;
        while(number>0){

            count++;
            number=number/10;
        }

        if (count%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num=1564434;
         boolean result=Even(num);
         System.out.println(result);

    }



}