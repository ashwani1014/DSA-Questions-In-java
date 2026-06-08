package Array;

public class plusOne {

    
    public int[] plusOne(int[] digits) {


             if(digits[digits.length-1]==9){
                 digits[digits.length-1]=0;
                  digits[digits.length-2]=1;
             }
          else{               
        digits[digits.length-1] =  digits[digits.length-1]+1;
          }
       
    
     return digits;

    }
}
    
 
