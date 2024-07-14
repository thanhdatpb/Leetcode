package BalancedBinaryTree_110;

import javax.swing.tree.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return ans;
    }

    private boolean ans = true;

    public int maxDepth(TreeNode root) {
        if (root == null || !ans)
            return 0;
        final int left = maxDepth(root.left);
        final int right = maxDepth(root.right);
        if (Math.abs(left - right) > 1)
            ans = false;
        return Math.max(left, right) + 1;
    }
}
