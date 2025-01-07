package Top_Interview_150.PathSum_112;

import javax.swing.tree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.val == sum && root.left == null && root.right == null)
            return true;
        return                                       //
                hasPathSum(root.left, sum - root.val) || //
                        hasPathSum(root.right, sum - root.val);
    }
}