package String;

public class Merge1768 {
    

     
    public String mergeAlternately(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < len; i++) {
            st.append(word1.charAt(i));
            st.append(word2.charAt(i));
        }

        st.append(word2.substring(len));
        st.append(word1.substring(len));

        return st.toString();

    }
} 