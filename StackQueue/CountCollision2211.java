
import java.util.*;

class Solution {
    public int countCollisions(String directions) {

        Stack<Character> st = new Stack<>();
        int collisions = 0;

        for (char ch : directions.toCharArray()) {

            if (ch == 'R') {
                st.push(ch);
            }

            else if (ch == 'S') {

                while (!st.isEmpty() && st.peek() == 'R') {
                    st.pop();
                    collisions++;
                }

                st.push('S');
            }

            else { // ch == 'L'

                if (!st.isEmpty() && st.peek() == 'R') {

                    st.pop();
                    collisions += 2;

                    while (!st.isEmpty() && st.peek() == 'R') {
                        st.pop();
                        collisions++;
                    }

                    st.push('S');
                }

                else if (!st.isEmpty() && st.peek() == 'S') {
                    collisions++;
                }
            }
        }

        return collisions;
    }
}
