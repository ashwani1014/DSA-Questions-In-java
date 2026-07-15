package String;

import java.util.ArrayList;
import java.util.List;

// LeetCode 93: Restore IP Addresses
public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> parts, List<String> result) {
        if (parts.size() == 4 && start == s.length()) {
            result.add(String.join(".", parts));
            return;
        }
        if (parts.size() == 4 || start == s.length()) return;

        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break;
            String part = s.substring(start, start + len);
            if (part.length() > 1 && part.charAt(0) == '0') break;
            if (Integer.parseInt(part) > 255) break;
            parts.add(part);
            backtrack(s, start + len, parts, result);
            parts.remove(parts.size() - 1);
        }
    }

    public static void main(String[] args) {
        RestoreIPAddresses obj = new RestoreIPAddresses();
        System.out.println(obj.restoreIpAddresses("25525511135"));
    }
}
