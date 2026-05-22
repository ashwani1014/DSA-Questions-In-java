public class Search_in_2D_matrix {
    

     

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }

            // Move Left
            else if (target < matrix[row][col]) {
                col--;
            }

            // Move Down
            else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int target = 5;

        boolean ans = searchMatrix(matrix, target);

        System.out.println(ans);
    }
}
 
