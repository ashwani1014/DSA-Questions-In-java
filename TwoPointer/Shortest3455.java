class Solution {
    public int shortestMatchingSubstring(String s, String p) {

        int count = 0;
        int newcount = 0;

        if (p.contains("*") && !p.matches(".*[a-z].*")) {
            return 0;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < p.length()) {

            if (p.charAt(j) == '*') {
                j++;
                continue;
            }

            if (s.charAt(i) == p.charAt(j)) {
                count++;
                j++;
            } else {
                newcount++;
            }

            i++;
        }

        return count + newcount;
    }
}