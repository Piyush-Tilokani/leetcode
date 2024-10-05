class Solution {
    private void helper(int i, int n, String s, List<String> ans){
        if(i==n){
            ans.add(s);
            return;
        }
        if(i==0){
            helper(i+1, n, s+"0", ans);
            helper(i+1, n, s+"1", ans);
            return;
        }
        if(s.charAt(i-1)=='0'){
            helper(i+1, n, s+"1", ans);
            return;
        }
        else{
            helper(i+1, n, s+"0", ans);
            helper(i+1, n, s+"1", ans);
            return;
        }
    }
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        helper(0, n, "", ans);
        return ans;
    }
}