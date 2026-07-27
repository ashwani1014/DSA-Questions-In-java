package Array;
public class Min_No_of_boxes_1769 {
    
    public int[] minOperations(String boxes) {
        int n = boxes.length();
         
        int[] arr = new int[n];
        for (int i = 0; i < boxes.length(); i++) {
            int sum=0;
            for (int j = 0; j < n; j++) {
                if(boxes.charAt(j)=='1'){
                sum = sum +Math.abs (i - j);
                }
            }
            arr[i] = sum;
        }
        return arr;
    }
}
 
