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
    // private void in(TreeNode root){ //inorder print function
    //     if(root!=null){
    //         in(root.left);
    //         System.out.print(root.val +", ");
    //         in(root.right);
    //     }
    //     return;
    // }
    private void getInOrder(TreeNode root, List<Integer> l){
        if(root!=null){
            getInOrder(root.left, l);
            l.add(root.val);
            getInOrder(root.right, l);
        }
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        // Approach: Do the inorder traversal and return the k-1th element
        List<Integer> l = new ArrayList<>();
        getInOrder(root, l);
        return l.get(k-1);
    }
}