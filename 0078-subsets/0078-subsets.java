class Solution {
    private void getSub(int nums[], int n, List<Integer> l, List<List<Integer>> ans){
        if(n==nums.length){
            List<Integer> addMe = new ArrayList<>(l); //This line is important because the ans variable is taking an instance of List<> as inputs
            ans.add(addMe);
            return;
        }
        getSub(nums, n+1, l, ans);
        l.add(nums[n]);
        getSub(nums, n+1, l, ans);
        l.remove(l.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSub(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
}