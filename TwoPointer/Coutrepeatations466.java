class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {

        int j = 0;
        int count = 0;

        for (int i = 0; i < n1; i++) {
            for (int k = 0; k < s1.length(); k++) {

                if (s1.charAt(k) == s2.charAt(j)) {
                    j++;
                }

                if (j == s2.length()) {
                    count++;
                    j = 0;
                }
            }
        }

        return count / n2;
    }
}