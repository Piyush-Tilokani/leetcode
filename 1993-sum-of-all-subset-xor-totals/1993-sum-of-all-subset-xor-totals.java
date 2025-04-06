class Solution {
    private int helper(int [] nums, int i, int xor){
        if(i>=nums.length)
            return xor;
        int pick = helper(nums, i+1, nums[i]^xor);
        int notPick = helper(nums, i+1, xor);
        return pick+notPick;
    }
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
}