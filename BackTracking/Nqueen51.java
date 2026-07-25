package BackTracking;

import java.util.List;

 

class Solution {

    public List<List<String>> solveNQueens(int n) {
         List<List<String>> ans=new ArrayList<>();
         int row=0;
         int col=0;
     char[][] board = new char[n][n];

for (int i = 0; i < n; i++) {
    Arrays.fill(board[i], '.');
}
          
          return (helper(board, row, ans));

    }


    public static List<List<String>> helper(char[][] board, int row, List ans){
       if (row ==board.length) {

    List<String> temp = new ArrayList<>();

    for (char[] r : board) {
        temp.add(new String(r));
    }

    ans.add(temp);
    return ans;
}

        for(int col=0;col<board.length;col++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';

                helper(board,row+1,ans);
                board[row][col] = '.';
            }
        }
        return ans;
    }

    public static boolean isSafe(int row,int col,char[][]board){
        //upper
        for (int i = row - 1; i >= 0; i--) {
          if (board[i][col] == 'Q') {
        return false;
    }

        } 

      //up-left
     for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
    if (board[r][c] == 'Q') {
        return false;
    }
     }

   for (int r = row - 1, c = col + 1;
     r >= 0 && c < board.length;
     r--, c++) {

    if (board[r][c] == 'Q') {
        return false;
    }
}

 return true;
      
    }
     
}


 
