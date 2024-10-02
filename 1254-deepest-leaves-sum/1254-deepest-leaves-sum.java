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
    public int deepestLeavesSum(TreeNode root) {
        //Approach: Level order traversal 
        // TC: O(n), SC: O(n)
        if(root==null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int ans=0;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            int levelSum = 0;
            for(int i=0; i<n; i++){
                TreeNode t = q.poll();
                levelSum += t.val;
                if(t.left!=null)
                    q.offer(t.left);
                if(t.right!=null)
                    q.offer(t.right);
            }
            ans = levelSum;
        }
        return ans;
    }
}