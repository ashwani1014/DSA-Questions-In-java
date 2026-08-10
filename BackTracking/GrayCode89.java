package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GrayCode89 {
    class Solution {

    public List<Integer> grayCode(int n) {

        List<Integer> ans = new ArrayList<>();
        boolean[] used = new boolean[1 << n];

        ans.add(0);
        used[0] = true;

        backtrack(n, ans, used);

        return ans;
    }

    boolean backtrack(int n, List<Integer> ans, boolean[] used) {

        if (ans.size() == (1 << n))
            return true;

        int current = ans.get(ans.size() - 1);

        for (int bit = 0; bit < n; bit++) {

            int next = current ^ (1 << bit);

            if (used[next])
                continue;

            ans.add(next);
            used[next] = true;

            if (backtrack(n, ans, used))
                return true;

            // BACKTRACK
            ans.remove(ans.size() - 1);
            used[next] = false;
        }

        return false;
    }
}
}
