package BackTracking;
import java.util.*;

class SOlution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');

        }
        helper(0, board, ans);
        return ans;

    }

    void helper(int row, char[][] board, List<List<String>> ans) {
        if (row == board.length) {
            List<String> temp = new ArrayList<>();

            ans.add(temp);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (!safe(row, col, board)) {
                continue;
            }
            board[row][col] = 'Q';

            helper(row + 1, board, ans);

            board[row][col] = '.';
        }
    }

    boolean safe(int row, int col, char[][] board) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Upper-left diagonal

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

         // Upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;

    }
}