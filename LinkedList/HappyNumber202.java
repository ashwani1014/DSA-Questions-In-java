package LinkedList;

public class HappyNumber202 {
    
    
    public boolean isHappy(int n) {
        int f=n;
        int s=n;
       do{
         f = square(f);
         s = square(square(s));
       }
        while (f != s) ;
            if (f == 1) {
                return true;
            }

        
        return false;
    }

    public int square(int n) {
        int ans = 0;
        while (n > 0) {
         int   rem = n % 10;
            ans = rem * rem + ans;
            n = n / 10;
        }
        return ans;
    }

}
 
