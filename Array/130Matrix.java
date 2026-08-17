public class 130Matrix {
    import java.util.*;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        List<int[]> cells = new ArrayList<>();

        // Store all cells
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells.add(new int[]{r, c});
            }
        }

        // Sort by Manhattan distance
        cells.sort((a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return distA - distB;
        });

        // Convert List<int[]> to int[][]
        int[][] result = new int[cells.size()][2];

        for (int i = 0; i < cells.size(); i++) {
            result[i] = cells.get(i);
        }

        return result;
    }
}
}
