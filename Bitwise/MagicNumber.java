package Bitwise;

public class MagicNumber {
    
      public static void main(String[]args){
         
   int ans=0;
   int base=5;
   int num=6;

   while(num>0){
   int last = num & 1;

            ans += last * base;

            base *= 5;
            num >>= 1;
        }

        System.out.println(ans);


      }


}
