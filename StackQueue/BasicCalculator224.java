import java.util.Stack;

public class BasicCalculator224 {
    class Solution {
        public int calculate(String s) {
            Stack<Integer> stack = new Stack<>();
            int sign = 1;
            int result = 0;
            int num = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                } else if (c == '+') {
                    result += sign * num;
                    sign = 1;
                    num = 0;
                } else if (c == '-') {
                    result += sign * num;
                    sign = -1;
                    num = 0;
                } else if (c == '(') {
                    // Push the result and sign calculated so far onto the stack
                    stack.push(result);
                    stack.push(sign);
                    // Reset for the new sub-expression inside the parentheses
                    sign = 1;
                    result = 0;
                } else if (c == ')') {
                    // Calculate the result of the expression inside the parentheses
                    result += sign * num;
                    num = 0;

                    // Pop the sign that was before the parentheses
                    int prevSign = stack.pop();
                    // Pop the result calculated before the parentheses
                    int prevResult = stack.pop();

                    // Combine the results
                    result = prevResult + (prevSign * result);
                }
                // Ignore spaces
            }

            // Add the last number if any
            result += sign * num;

            return result;
        }
    }
}
