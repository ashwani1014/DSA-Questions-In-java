import java.util.*;

class Solution {

    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new ArrayDeque<>();

        int fresh = 0;

        // 1. Add all rotten oranges
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {

                if (grid[r][c] == 2) {
                    q.offer(new int[]{r, c});
                }

                if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        int time = 0;

        // 2. Multi-source BFS
        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            // Process one level = one minute
            for (int i = 0; i < size; i++) {

                int[] cell = q.poll();

                for (int[] dir : directions) {

                    int nr = cell[0] + dir[0];
                    int nc = cell[1] + dir[1];

                    // Valid + fresh
                    if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc] == 1) {

                        // Fresh -> Rotten
                        grid[nr][nc] = 2;

                        fresh--;

                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            time++;
        }

        // 3. Check if all fresh oranges became rotten
        if (fresh == 0) {
            return time;
        }

        return -1;
    }
}