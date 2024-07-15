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
    public TreeNode createBinaryTree(int[][] descriptions) {
        //TC: O(n), SC: O(n)
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>(); 
        for(int n[]: descriptions){
            TreeNode node = new TreeNode(n[0]);
            TreeNode child = new TreeNode(n[1]);
            map.put(n[0], node);
            map.put(n[1], child);
            children.add(n[1]);
        }
        for(int n[]: descriptions){
            TreeNode node = map.get(n[0]);
            if(n[2]==1)
                node.left = map.get(n[1]);
            else
                node.right = map.get(n[1]);
        }
        int root = 0;
        for(int n[]: descriptions){
            if(!children.contains(n[0]))
                root = n[0];
        }
        return map.get(root);
    }
}