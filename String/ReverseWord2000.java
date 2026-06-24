package String;
public class ReverseWord2000 {
    

     
    public String reversePrefix(String word, char ch) {

        String ans = "";

        for (int i = 0; i < word.length(); i++) {
             
            if (ch == word.charAt(i)) {

                int k = i;

                while (k >= 0) {
                    ans += word.charAt(k);
                    k--;
                }

                for (int j = i + 1; j < word.length(); j++) {
                    ans += word.charAt(j);
                }

                return ans;
            }
           

        }

        return word;
    }
}
 
