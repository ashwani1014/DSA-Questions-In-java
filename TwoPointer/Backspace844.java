public class Backspace844 {
    class Solution {
        public boolean backspaceCompare(String s, String t) {

            int i = s.length() - 1;
            int j = t.length() - 1;

            while (i >= 0 || j >= 0) {

                // Skip '#' from right in s
                int skipS = 0;
                while (i >= 0) {
                    if (s.charAt(i) == '#') {
                        skipS++;
                        i--;
                    } else if (skipS > 0) {
                        skipS--;
                        i--;
                    } else {
                        break;
                    }
                }

                // Skip '#' from right in t
                int skipT = 0;
                while (j >= 0) {
                    if (t.charAt(j) == '#') {
                        skipT++;
                        j--;
                    } else if (skipT > 0) {
                        skipT--;
                        j--;
                    } else {
                        break;
                    }
                }

                // Compare chars
                if (i >= 0 && j >= 0) {
                    if (s.charAt(i) != t.charAt(j)) {
                        return false;
                    }
                } else if (i >= 0 || j >= 0) {
                    return false; // one string has remaining chars, other is empty
                }

                i--;
                j--;
            }

            return true;
        }
    }

}
