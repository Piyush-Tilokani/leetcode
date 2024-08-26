/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private void postorder(Node root, List<Integer> ans){
        if(root!=null){
            for(Node n: root.children){
                postorder(n, ans);
                ans.add(n.val);
            }
        }
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null)
            return ans;
        postorder(root, ans);
        ans.add(root.val);
        return ans;
    }
}