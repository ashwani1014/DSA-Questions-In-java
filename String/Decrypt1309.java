package String;


public class Decrypt1309 {
    

    
    public String freqAlphabets(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = arr.length - 1;
        while(i >= 0)
        {
            if(arr[i] == '#')
            {
                int tens = arr[i - 2] - '0';
                int ones = arr[i - 1] - '0';
                int val = tens * 10 + ones;
                
                sb.append((char) ('a' + val - 1));
                i -= 3;
            }
            else
            {
                int val = arr[i] - '0';
                sb.append((char) ('a' + val - 1));
                i--;
            }
        }
        sb.reverse();
        return sb.toString();
    }
}
