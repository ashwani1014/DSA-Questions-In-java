import java.util.Stack;

class Solution {

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();

        int n = heights.length;
        int max = 0;

        for (int i = 0; i <= n; i++) {

            int curr = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && heights[st.peek()] > curr) {

                int h = heights[st.pop()];

                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();

                int width = right - left - 1;

                int area = h * width;

                max = Math.max(max, area);
            }

            if (i < n) {
                st.push(i);
            }
        }

        return max;
    }
}