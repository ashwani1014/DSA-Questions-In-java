import java.util.Arrays;

public class Searching2D {

   static int[] search(int[][] arr, int target) {

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
               return new int[] { i, j };
            }
         }
      }
      return new int[] { -1, -1 };

   }

   public static void main(String[] args) {
      int[][] arr = { { 24, 5, 5, 9, },
            { 55, 5, 8, 4, 6, 1, 4 }, { 1, 4, 58, 52, 4, 2 } };
      int[] result = search(arr, 1);
      System.out.println(Arrays.toString(result));
   }

}
