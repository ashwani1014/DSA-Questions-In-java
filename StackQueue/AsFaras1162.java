import java.util.ArrayDeque;
import java.util.Queue;

public class AsFaras1162 {
    class Solution {
        public int maxDistance(int[][] grid) {
            int max = 0;
            int ans = 0;
            int m = grid.length;
            int n = grid[0].length;

            Queue<int[]> q = new ArrayDeque<>();

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (grid[i][j] == 1) {
                        q.offer(new int[] { i, j });
                    } else {
                        grid[i][j] = -1;
                    }
                }
            }

            int[][] dir = {
                    { 0, 1 },
                    { 0, -1 },
                    { 1, 0 },
                    { -1, 0 }
            };

            while (!q.isEmpty()) {

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for (int[] d : dir) {

                    int nr = r + d[0];
                    int nc = c + d[1];

                    // Boundary check
                    if (nr >= 0 && nr < m &&
                            nc >= 0 && nc < n &&
                            grid[nr][nc] == -1) {

                        grid[nr][nc] = grid[r][c] + 1;
                        ans = grid[nr][nc];
                        max = Math.max(max, ans);

                        q.offer(new int[] { nr, nc });

                    }
                }
            }

            return max - 1;
        }
    }
}
