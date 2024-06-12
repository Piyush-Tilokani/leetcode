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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>(); //Final ans
        if(root==null) //Base check
            return ans;
        Queue<TreeNode> q = new LinkedList<>(); //Queue to store child node of nodes at every level
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>(); //elements of the current level
            for(int i=0; i<levelSize; i++){ 
                    TreeNode currentNode = q.poll();
                    currentLevel.add(currentNode.val); //Add all the current level elements
                    
                    //Add non-null children of every node at current level
                    if(currentNode.left!=null)
                        q.offer(currentNode.left); 
                    if(currentNode.right!=null)
                        q.offer(currentNode.right);
            }
            ans.add(currentLevel);
        }

        return ans;  
    }
}