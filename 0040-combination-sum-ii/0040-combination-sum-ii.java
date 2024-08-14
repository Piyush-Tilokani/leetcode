class Solution {
    private void combine(int []nums, int t, int i, List<Integer> l, List<List<Integer>> ans){
        if(t==0){ //If targer is achieved, add list to ans and return
            ans.add(new ArrayList<>(l));
            return;
        }        
        for(int j=i; j<nums.length; j++){ //For each element, check if it can be the jth element of the intermediate list
            if(j>i && nums[j]==nums[j-1]) //If it is already present at the jth position in recursive call, continue to next element
                continue;
            if(nums[j]>t) //If element exceeds the target break
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