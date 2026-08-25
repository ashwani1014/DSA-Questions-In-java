package Stack&Queue;

import java.util.*;

public class Minimumremove1249 {

    class Solution {
        public String minRemoveToMakeValid(String s) {

            Stack st = new Stack<>();
            String p = "";

            for (char c : s.toCharArray()) {

                if (Character.isLetter(c)) {
                    p = p + c;
                }

                else if (c == '(') {
                    p = p + c;
                    st.push(c);
                }

                else {
                    if (c == ')' && !st.isEmpty()) {
                        p = p + c;
                        st.pop();
                    }
                }
            }

            // Yahan ab unmatched '(' bache hain
            while (!st.isEmpty()) {
                int index = p.lastIndexOf('(');
                p = p.substring(0, index) + p.substring(index + 1);
                st.pop();

                // yahan p se index wala character remove kar
                // phir stack se pop
            }

            return p;
        }
    }
}