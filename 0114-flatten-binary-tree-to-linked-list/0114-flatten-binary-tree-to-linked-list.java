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
        // Queue<TreeNode> q = new LinkedList<>();
        // preorder(root, q);
        // TreeNode current = q.poll();
        // while(!q.isEmpty()){
        //     current.left = null;
        //     current.right = q.poll();
        //     current = current.right;


        //--------------------------------------------------------------------------------------------------


        //Optimal solution: At every point, join the right subtree to rightmost empty spot of left subtree
        //join the right subtree to left and make left null
        //TC: O(n), SC:O(1)
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){ //If left is not null, adjust left part
                TreeNode temp = curr.left;  
                while(temp.right!=null) //Find the rightmost empty spot in the left tree
                    temp=temp.right;
                temp.right = curr.right; //Join current tree's right subtree to right of the empty spot
                curr.right = curr.left;  //Reassign right of current node to adjusted left part
                curr.left = null;        //Make left of the current node null
            }
            curr=curr.right; //If left is null or already adjustded, move to right node
        }
    }
}