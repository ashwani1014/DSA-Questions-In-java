

class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[] height = new int[m];
        int ans = 0;

        for (int i = 0; i < n; i++) {

            // Update histogram heights
            for (int j = 0; j < m; j++) {
                height[j] = mat[i][j] == 1 ? height[j] + 1 : 0;
            }

            // Monotonic stack
            int[] sum = new int[m];
            Stack<Integer> st = new Stack<>();

            for (int j = 0; j < m; j++) {

                while (!st.isEmpty() &&
                       height[st.peek()] >= height[j]) {
                    st.pop();
                }

                if (!st.isEmpty()) {
                    int prev = st.peek();
                    sum[j] = sum[prev] +
                             height[j] * (j - prev);
                } else {
                    sum[j] = height[j] * (j + 1);
                }

                st.push(j);
                ans += sum[j];
            }
        }

        return ans;
    }
}
