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
    public void preOrder(TreeNode n, List l){
        if(n == null){
            return;
        }
        else{
            l.add(n.val);
            preOrder(n.left, l);
            preOrder(n.right, l);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        preOrder(root, ret);
        return ret;
    }
}