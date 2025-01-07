package Top_Interview_150.SymmetricTree_101;

import javax.swing.tree.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }
    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }

}