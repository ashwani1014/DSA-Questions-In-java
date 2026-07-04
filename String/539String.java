
import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {

        if (timePoints.size() > 1440) {
            return 0;
        }

        List<Integer> minutes = new ArrayList<>();

        for (String time : timePoints) {
            int hour = Integer.parseInt(time.substring(0, 2));
            int minute = Integer.parseInt(time.substring(3));

            minutes.add(hour * 60 + minute);
        }

        Collections.sort(minutes);

        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < minutes.size(); i++) {
            ans = Math.min(ans, minutes.get(i) - minutes.get(i - 1));
        }

        // Compare last and first across midnight
        ans = Math.min(ans, 1440 - minutes.get(minutes.size() - 1) + minutes.get(0));

        return ans;
    }
}
