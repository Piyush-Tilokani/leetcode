class Solution {
    private void combineList(int i, int []nums, int t, List<List<Integer>> ans, List<Integer> l){
        if(t==0){ //If target is reduced to zero, add the intermediary list into the main answer list
            ans.add(new ArrayList<>(l));
            return;
        }
        if(i>=nums.length || nums[i]>t) //If array is sorted, we can assure that adding an element greater than current needed target will never fulfill our goal as next elements are greater than this current element
            return;
        l.add(nums[i]); //Pick
        t-=nums[i]; //Pick
        combineList(i, nums, t, ans, l); //Pick
        l.remove(l.size()-1); //Not pick
        t+=nums[i]; //Not pick
        combineList(i+1, nums, t, ans, l); //not Pick
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combineList(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}