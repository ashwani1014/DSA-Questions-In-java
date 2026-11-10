class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        long prev = Long.MIN_VALUE;

        while (curr != null || !st.isEmpty()) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();

            if (curr.val <= prev) {
                return false;
            }

            prev = curr.val;
            curr = curr.right;
        }

        return true;
    }
}
