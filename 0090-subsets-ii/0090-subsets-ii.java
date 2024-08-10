class Solution {
    private void backtrack(int []nums, int i, List<Integer> l, Set<List<Integer>> ans){ //Same algo as Subsets: https://leetcode.com/problems/subsets/
        if(i>=nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        backtrack(nums, i+1, l, ans);
        l.add(nums[i]);
        backtrack(nums, i+1, l, ans);
        l.remove(l.size()-1);        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>(); //Use HashSet instead of ArrayList, to avoid duplicates
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(), ans);
        return new ArrayList<>(ans); //Conver HashSet to ArrayList and return
    }
}