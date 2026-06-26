package String;

public class Split1616 {
    
 

    public boolean checkPalindromeFormation(String a, String b) {

        int n = a.length();

        for (int i = 0; i <= n; i++) {

            String s1 = a.substring(0, i) + b.substring(i);
            if (isPalindrome(s1)) {
                return true;
            }

            String s2 = b.substring(0, i) + a.substring(i);
            if (isPalindrome(s2)) {
                return true;
            }
        }

        return false;
    }

    boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
 
