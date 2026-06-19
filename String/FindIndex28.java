package String;

public class FindIndex28 {
        

 
    public int strStr(String haystack, String needle) {

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j;

            for(j = 0; j < needle.length(); j++) {

                if(haystack.charAt(i + j) == needle.charAt(j)) {
                    continue;
                }
                else {
                    break;
                }
            }

            if(j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}


 
