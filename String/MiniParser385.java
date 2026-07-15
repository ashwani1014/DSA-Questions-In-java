package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// LeetCode 385: Mini Parser
// NestedInteger interface stub for compilation
public class MiniParser385 {

    // Stub implementation of NestedInteger for local compilation
    static class NestedInteger {
        private Integer value;
        private List<NestedInteger> list;

        public NestedInteger() {
            this.list = new ArrayList<>();
        }

        public NestedInteger(int value) {
            this.value = value;
            this.list = new ArrayList<>();
        }

        public boolean isInteger() { return value != null; }
        public Integer getInteger() { return value; }
        public void setInteger(int value) { this.value = value; }
        public void add(NestedInteger ni) { this.list.add(ni); }
        public List<NestedInteger> getList() { return list; }
    }

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
            } else if (c == '-') {
                negative = true;
            } else if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                hasNum = true;
            } else if (c == ',' || c == ']') {

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
