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
    int ans=0;
    private int[] postOrder(TreeNode root){//Function returns a pair of integers(Sum of nodes, no. of nodes)
        if(root==null)
            return new int[2];
        int[] left = postOrder(root.left);
        int[] right = postOrder(root.right);

        int nodeSum = left[0] + right[0] + root.val;
        int nodeCount = left[1] + right[1] + 1;

        // System.out.println("Node: "+root.val);
        if(root.val == (nodeSum/nodeCount))
            ans++;
        
        return new int[]{nodeSum, nodeCount};
    }
    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return ans;
    }
}