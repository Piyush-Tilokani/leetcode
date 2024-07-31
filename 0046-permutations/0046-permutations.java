class Solution {
    private void permute(int []nums, int i, List<Integer> l, List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=0; j<nums.length; j++){
            if(!l.contains(nums[j])){ //Add new element only if the list does not contain it
                l.add(nums[j]);
                permute(nums, i+1, l, ans);
                l.remove(l.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}