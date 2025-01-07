package Top_Interview_150.MaximumDepthofBinaryTree_104;

import javax.swing.tree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
