
class Solution {
    public long bowlSubarrays(int[] nums) {
        Stack<Integer> st = new Stack<>();
        long ans = 0;

        for (int num : nums) {

            while (!st.isEmpty() && st.peek() < num) {
                st.pop();

                if (!st.isEmpty()) {
                    ans++;
                }
            }

            st.push(num);
        }

        return ans;
    }
}
