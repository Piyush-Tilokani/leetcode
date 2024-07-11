/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) //null nodes have 0 depth
            return 0;
        int left = 1+maxDepth(root.left); // If node is !null its depth is 1 + (depth of next node, will automatically return 0 if next node is null)
        int right = 1+maxDepth(root.right);
        return Math.max(left, right);
    }
}