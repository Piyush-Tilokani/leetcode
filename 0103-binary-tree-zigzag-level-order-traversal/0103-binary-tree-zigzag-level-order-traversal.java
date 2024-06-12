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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //Same as Binary Tree level order traversal https://leetcode.com/problems/binary-tree-level-order-traversal/
        //Just reverse the ArrayList alternatively

        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = q.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null)
                    q.offer(currentNode.left);
                if(currentNode.right!=null)
                    q.offer(currentNode.right);
            }
            if(level%2==0) //This if else check makes sure alternating reversal of the ArrayList
                ans.add(currentLevel);
            else{
                Collections.reverse(currentLevel);
                ans.add(currentLevel);
            }
            level++;
        }
        return ans;
    }
}