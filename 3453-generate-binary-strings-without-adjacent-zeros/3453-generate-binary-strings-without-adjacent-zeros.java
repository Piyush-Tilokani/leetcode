class Solution {
    // Approach: Recursive backtracking
    private void helper(int i, int n, char[] s, List<String> ans){
        if(i==n){
            ans.add(new String(s));
            return;
        }
        if(i==0){
            s[0] = '0';
            helper(i+1, n, s, ans);
            s[0] = '1';
            helper(i+1, n, s, ans);
            return;
        }
        if(s[i-1]=='0'){
            s[i] = '1';
            helper(i+1, n, s, ans);
            return;
        }
        else{
            s[i] = '0';
            helper(i+1, n, s, ans);
            s[i] = '1';
            helper(i+1, n, s, ans);
            return;
        }
    }
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        helper(0, n, new char[n], ans);
        return ans;
    }
}