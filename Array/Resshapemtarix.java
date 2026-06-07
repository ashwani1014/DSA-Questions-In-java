package Array;

public class Resshapemtarix {


    
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    


    int [][]arr=new int [r][c];
    for(int i = 0; i <mat.length; i++) {

    for(int j = 0; j <mat[i].length; j++) {


        
      arr[i][j]=mat[i][j];
         

    }
 
}
return arr;

    }
}
    
 
