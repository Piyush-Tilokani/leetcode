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
    public int maxLevelSum(TreeNode root) {
        if(root.left==null && root.right==null)
            return 1;
        int level = 0;
        int ans=1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size = q.size();
            int levelSum=0;
            for(int i=0; i<size; i++){
                levelSum+=q.peek().val;
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                q.poll();
            }
            if(levelSum>max){
                max=levelSum;
                ans=level+1;
            }
                level++;
        }
        return ans;
    }
}