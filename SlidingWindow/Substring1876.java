class Solution {
    public int countGoodSubstrings(String s) {
        HashSet set = new HashSet<>();
        int i = 0;
        int j = 0;
        int count = 0;
        int k = 3;

        while (j < s.length()) {
            set.add(s.charAt(j));
            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {

                count++;
                set.remove(s.charAt(i));

            }
            i++;
            j++;

        }
        return count - 1;
    }
}