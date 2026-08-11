package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrme131 {
    
    List<List<String>> ans = new ArrayList<>();
    List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {

        helper(0, s);

        return ans;
    }

    public void helper(int index, String s) {

        // pura string consume ho gaya
        if (index == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        // index se i tak substring
        for (int i = index; i < s.length(); i++) {

            String segment = s.substring(index, i + 1);

            // condition
            if (!isPalindrome(segment)) {
                continue;
            }

            // CHOOSE
            path.add(segment);

            // EXPLORE
            helper(i + 1, s);

            // UNDO
            path.remove(path.size() - 1);
        }
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
 
