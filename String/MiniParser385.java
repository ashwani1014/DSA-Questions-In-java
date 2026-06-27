
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public class NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger() {}
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value) {}
 *
 *     // @return true if this NestedInteger holds a single integer.
 *     public boolean isInteger() {}
 *
 *     // @return the single integer that this NestedInteger holds.
 *     public Integer getInteger() {}
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value) {}
 *
 *     // Set this NestedInteger to hold a nested list.
 *     public void add(NestedInteger ni) {}
 *
 *     // @return the nested list that this NestedInteger holds.
 *     public List<NestedInteger> getList() {}
 * }
 */

class Solution {
    public NestedInteger deserialize(String s) {

        // Single number
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }

        Stack<NestedInteger> stack = new Stack<>();
        NestedInteger curr = null;

        int num = 0;
        boolean negative = false;
        boolean hasNum = false;

        for (char c : s.toCharArray()) {

            if (c == '[') {
                if (curr != null) {
                    stack.push(curr);
                }
                curr = new NestedInteger();
            }
            else if (c == '-') {
                negative = true;
            }
            else if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                hasNum = true;
            }
            else if (c == ',' || c == ']') {

                if (hasNum) {
                    if (negative) num = -num;
                    curr.add(new NestedInteger(num));

                    num = 0;
                    negative = false;
                    hasNum = false;
                }

                if (c == ']' && !stack.isEmpty()) {
                    NestedInteger parent = stack.pop();
                    parent.add(curr);
                    curr = parent;
                }
            }
        }

        return curr;
    }
}
