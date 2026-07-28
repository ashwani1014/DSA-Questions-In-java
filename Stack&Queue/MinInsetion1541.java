package Stack&Queue;

public class MinInsetion1541 {
    import java.util.Stack;

 
    public int minInsertions(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {

                // Check if we have "))"
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {

                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        count++;     // insert '('
                    }

                    i++;            // second ')' consumed

                } else {

                    // only one ')', need one more ')'
                    count++;

                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        count++;     // insert '('
                    }
                }
            }
        }

        // Every remaining '(' needs two ')'
        while (!stack.isEmpty()) {
            stack.pop();
            count += 2;
        }

        return count;
    }
}
 
