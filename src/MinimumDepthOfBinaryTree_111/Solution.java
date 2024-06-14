package MinimumDepthOfBinaryTree_111;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int ans = 0;
        Queue<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));

        while (!q.isEmpty()) {
            ++ans;
            for (int sz = q.size(); sz > 0; --sz) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) {
                    return ans;
                }
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
        }
        throw new IllegalArgumentException();
    }
}
