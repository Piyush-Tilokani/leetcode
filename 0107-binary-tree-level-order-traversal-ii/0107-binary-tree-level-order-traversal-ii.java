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
    public List<List<Integer>> levelOrderBottom(TreeNode root) { 
        //Literally the same as https://leetcode.com/problems/binary-tree-level-order-traversal/description/
        //Just after adding current level, a new level is added in front of the previous level
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<levelSize; i++){
                TreeNode current = q.poll();
                level.add(current.val);
                if(current.left!=null)
                    q.offer(current.left);
                if(current.right!=null)
                    q.offer(current.right);
            }
            ans.add(0, level); //After adding current level, a new level is added in front of the previous level
        }
        return ans;
    }
}