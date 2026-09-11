import java.util.*;

class Solution {

    public int[][] updateMatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[][] dist = new int[rows][cols];
        Queue<int[]> q = new ArrayDeque<>();

        // 1. Initialize queue with all 0s
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (mat[r][c] == 0) {
                    q.offer(new int[] { r, c });
                    dist[r][c] = 0;
                } else {
                    dist[r][c] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {
                { 1, 0 },
                { -1, 0 },
                { 0, 1 },
                { 0, -1 }
        };

        // 2. BFS to find shortest distance
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                // Valid cell
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {

                    // If we found a shorter path
                    if (dist[r][c] + 1 < dist[nr][nc]) {

                        dist[nr][nc] = dist[r][c] + 1;
                        q.offer(new int[] { nr, nc });
                    }
                }
            }
        }

        return dist;
    }
}
