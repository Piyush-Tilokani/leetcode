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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)
            return root;
        int level=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> temp = new ArrayList<>();
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                TreeNode n = q.poll();
                if(n.left!=null)
                    q.offer(n.left);
                if(n.right!=null)
                    q.offer(n.right);
                if(level%2==0){ //If even level, add next level values in order into a temp list
                    if(n.left!=null){
                        temp.add(n.left.val);
                        temp.add(n.right.val);
                    }
                }
                else //If odd level, get the values in reverse order from the list
                    n.val = temp.get(len-1-i);
            }
            if(level%2==1) //After using the list on odd level clear it for next use
                temp.clear();
            level++;
        }
        return root;
    }
}