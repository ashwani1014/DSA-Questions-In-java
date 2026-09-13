import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stamping_The_Sequence {
  class Solution {

    public int[] movesToStamp(String stamp, String target) {

        char[] t = target.toCharArray();
        char[] s = stamp.toCharArray();

        int n = t.length;
        int m = s.length;

        boolean[] visited = new boolean[n - m + 1];

        int stars = 0;

        List<Integer> ans = new ArrayList<>();

        while (stars < n) {

            boolean changed = false;

            for (int i = 0; i <= n - m; i++) {

                if (visited[i]) {
                    continue;
                }

                int count = erase(t, s, i);

                if (count > 0) {

                    visited[i] = true;
                    changed = true;

                    stars += count;
                    ans.add(i);

                    if (stars == n) {
                        break;
                    }
                }
            }

            if (!changed) {
                return new int[0];
            }
        }

        Collections.reverse(ans);

        return ans.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }


    private int erase(char[] target, char[] stamp, int pos) {

        int erased = 0;

        for (int j = 0; j < stamp.length; j++) {

            if (target[pos + j] == '*') {
                continue;
            }

            if (target[pos + j] != stamp[j]) {
                return 0;
            }

            erased++;
        }

        if (erased == 0) {
            return 0;
        }

        for (int j = 0; j < stamp.length; j++) {
            target[pos + j] = '*';
        }

        return erased;
    }
}
}
