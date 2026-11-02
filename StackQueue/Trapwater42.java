
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;

        java.util.Stack<Integer> st = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty()
                    && height[i] > height[st.peek()]) {

                int bottom = st.pop();

                if (st.isEmpty()) {
                    break;
                }

                int left = st.peek();

                int width = i - left - 1;

                int boundedHeight = Math.min(height[left], height[i])
                        - height[bottom];

                water += width * boundedHeight;
            }

            st.push(i);
        }

        return water;
    }
}
