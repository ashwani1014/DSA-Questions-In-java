package String;

public class SplitString1616 {
    

    

    public boolean checkPalindromeFormation(String a, String b) {

        return check(a,b) || check(b,a);
    }

    public boolean check (String s1,String s2){
     
        int left=0;
        int right=s2.length()-1;
          while(left<right && s1.charAt(left)==s2.charAt(right)){
            left++;
            right--;
          }

          return isPalindrome(s1, left, right) ||
               isPalindrome(s2, left, right);
    }

    boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
          
          return false;
            



    }

    
    }

 
