package Recursion;

public class MazeProblem {
    
 public static int count(String p ,int r,int c){
        if(r==1&& c==1){
          System.out.println(p);
          return 1;
        }

        int left = 0;
        int right = 0;

        if (r > 1) {
            left = count(p + "D", r - 1, c);
        }

        if (c > 1) {
            right = count(p + "R", r, c - 1);
        }

        return left + right;
    }

    public static void main(String[] args) {
        // count(3,3);
        System.out.println(count("",3, 3));

    }
}

  