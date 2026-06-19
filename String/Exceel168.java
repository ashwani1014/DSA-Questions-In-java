package String;

public class Exceel168 {
  
    public String convertToTitle(int columnNumber) {
         StringBuilder ans=new StringBuilder();


           int n=columnNumber;
         while(n>0){
            n--;

            int rem=n%26;
            ans.append((char)('A'+rem));

            n=n/26;

         }

          return ans.reverse().toString();

    }
 


}
