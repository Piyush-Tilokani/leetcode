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
    int ans=0;
    // private int secondLevelSum(TreeNode root){
    //     if(root==null)
    //         return 0;
    //     int level = 0;
    //     int sum=0;
    //     Queue<TreeNode> q=new LinkedList<>();
    //     q.offer(root);
    //     while(level<3 && !q.isEmpty()){
    //         int size = q.size();
    //         for(int i=0; i<size; i++){
    //             TreeNode n = q.poll();
    //             if(level==2)
    //                 sum+=n.val;
    //             if(n.left!=null)
    //                 q.offer(n.left);
    //             if(n.right!=null)
    //                 q.offer(n.right);
    //         }
    //         level++;
    //     }
    //     return sum;
    // }
    // private void inOrder(TreeNode root){
    //     if(root==null)
    //         return;
    //     inOrder(root.left);
    //     if(root.val%2==0){
    //         ans+=secondLevelSum(root);
    //     }
    //     inOrder(root.right);
    // }

    private void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        if(root.val%2==0){
            if(root.left!=null){
                if(root.left.left!=null)
                    ans+=root.left.left.val;
                if(root.left.right!=null)
                    ans+=root.left.right.val;
            }
            if(root.right!=null){
                if(root.right.left!=null)
                    ans+=root.right.left.val;
                if(root.right.right!=null)
                    ans+=root.right.right.val;
            }
        }
        inOrder(root.right);
    }
    public int sumEvenGrandparent(TreeNode root) {
        inOrder(root);
        return ans;
    }
}