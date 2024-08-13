class Solution {
    private void combine(int []nums, int t, int i, List<Integer> l, List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=i; j<nums.length; j++){
            if(j!=i && nums[j]==nums[j-1])
                continue;
            if(nums[j]>t)   
                break;
            l.add(nums[j]);
            combine(nums, t-nums[j], j+1, l, ans);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combine(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
}