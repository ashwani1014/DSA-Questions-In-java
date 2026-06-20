package String;

public class SplitString1616 {
    

    

    public boolean checkPalindromeFormation(String a, String b) {

        return check(a, b) || check(b, a);
    }

    boolean check(String a, String b) {

        int l = 0;
        int r = a.length() - 1;

        while(l < r && a.charAt(l) == b.charAt(r)) {
            l++;
            r--;
        }

        return isPalindrome(a, l, r)
                || isPalindrome(b, l, r);
    }

    boolean isPalindrome(String s, int l, int r) {

        while(l < r) {

            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
 
