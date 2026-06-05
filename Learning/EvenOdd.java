package Learning;

public class EvenOdd {
    
     static String numbertype(int n){

        if((n&1)==1){
            return "odd";
        }
        else{
            return "even" ;
        }
    }


    public static void main(String[]args){
     String a=   numbertype(23);
        System.out.println(a);
    }
}
