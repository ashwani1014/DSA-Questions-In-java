package Recursion;

public class MazeProblem {
    

    public int count(int r,int c){
        if(r==1|| c==1){
            return 1;
        }

        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }
}
