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
    private void preorder(TreeNode root, Queue<TreeNode> q){
        if(root!=null){
            q.offer(root);
            preorder(root.left, q);
            preorder(root.right, q);
        }
    }
    public void flatten(TreeNode root) {
        //Brute force: Store the preorder traversal in a queue and then make the connections
        //TC: O(n), SC:O(n)
        Queue<TreeNode> q = new LinkedList<>();
        preorder(root, q);
        TreeNode current = q.poll();
        while(!q.isEmpty()){
            current.left = null;
            current.right = q.poll();
            current = current.right;
        }

    }
}