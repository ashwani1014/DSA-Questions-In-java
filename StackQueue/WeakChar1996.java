
import java.util.Arrays;

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {

        Arrays.sort(properties, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(b[0], a[0]);
        });

        int maxDefense = 0;
        int count = 0;

        for (int[] p : properties) {

            if (p[1] < maxDefense) {
                count++;
            }

            maxDefense = Math.max(maxDefense, p[1]);
        }

        return count;
    }
}
