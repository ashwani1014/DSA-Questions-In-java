public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "abca";
        System.out.println(sol.almostPalindromic(s));
    }
}

class Solution {
    public int almostPalindromic(String s) {
        int i = 0;
        int j = s.length() - 1;
        String ans = "";

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                ans += s.charAt(i);
                i++;
                j--;
            } else {
                if (isPalindrome(s, i + 1, j)) {
                    i++;
                } else if (isPalindrome(s, i, j - 1)) {
                    j--;
                } else {
                    i++;
                }
            }
        }

        return ans.length() + 1;
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}