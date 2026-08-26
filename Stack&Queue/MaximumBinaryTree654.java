class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int start, int end) {

        // 1. Base Case: invalid range
        if (start > end) {
            return null;
        }

        // 2. Find Max
        int maxIdx = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        // 3. Root = Max Element
        TreeNode root = new TreeNode(nums[maxIdx]);

        // 4. Recursive Calls
        root.left = helper(nums, start, maxIdx - 1);
        root.right = helper(nums, maxIdx + 1, end);

        return root;
    }
}
