class Solution {
    private void combine(int n, int k, List<List<Integer>> ans, List<Integer> l, int i){
        if(k==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=i; j<=n-k+1; j++){
            l.add(j);
            combine(n, k-1, ans, l, j+1);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combine(n, k, ans, new ArrayList<Integer>(), 1);
        return ans;
    }
}