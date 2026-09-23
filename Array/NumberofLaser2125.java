
import java.util.ArrayList;

public class NumberofLaser2125 {
    class Solution {
        public int numberOfBeams(String[] bank) {

            int n = bank.length;
            ArrayList<Integer> list = new ArrayList<>();

            // Count lasers in each row
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < bank[i].length(); j++) {
                    if (bank[i].charAt(j) == '1') {
                        count++;
                    }
                }
                list.add(count);
            }

            int ans = 0;
            int prev = 0;

            // Pair consecutive rows with lasers
            for (int i = 0; i < n; i++) {

                int curr = list.get(i);

                if (curr == 0) {
                    continue;
                }

                if (prev != 0) {
                    ans += curr * prev;
                }

                prev = curr;
            }

            return ans;
        }
    }
}