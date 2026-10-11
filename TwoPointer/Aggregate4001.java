
import java.util.*;

class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        TreeSet<Integer> timestamps = new TreeSet<>();

        for (int[] s : series1) {
            timestamps.add(s[0]);
        }

        for (int[] s : series2) {
            timestamps.add(s[0]);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int t : timestamps) {
            int val1 = getValue(series1, t);
            int val2 = getValue(series2, t);

            result.add(Arrays.asList(t, val1 + val2));
        }

        return result;
    }

    private int getValue(int[][] series, int t) {
        int left = 0;
        int right = series.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (series[mid][0] >= t) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left < series.length ? series[left][1] : 0;
    }
}
