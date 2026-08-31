package StackQueue;

import java.util.Stack;

public class FinalPrices1475 {

    class Solution {
        public int[] finalPrices(int[] prices) {

            Stack<Integer> st = new Stack<>();
            int[] ans = new int[prices.length];

            // Loop backwards
            for (int i = prices.length - 1; i >= 0; i--) {

                // Remove greater or equal elements from stack
                while (!st.isEmpty() && st.peek() > prices[i]) {
                    st.pop();
                }

                // If stack is empty → no discount
                if (st.isEmpty()) {
                    ans[i] = prices[i];
                } else {
                    // top is the first smaller element
                    ans[i] = prices[i] - st.peek();
                }

                // push current element
                st.push(prices[i]);
            }

            return ans;
        }
    }

}
