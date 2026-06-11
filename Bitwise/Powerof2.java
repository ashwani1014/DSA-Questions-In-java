package Bitwise;
public class Powerof2{


public static void main(String[]args){
    
    int n=8;
    if((n&(n-1))==0)
        {
        System.out.println("Yes");

    }
    else{
      System.out.println("No");
    }
}

}