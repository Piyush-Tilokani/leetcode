class Solution {
    private int countMaxOrSubsets(int [] nums, int maxOr, int i, int or){
        if(i>=nums.length){
            if(or==maxOr)
                return 1;
            return 0;
        }
        int notPick = countMaxOrSubsets(nums, maxOr, i+1, or);
        or |= nums[i];
        int pick = countMaxOrSubsets(nums, maxOr, i+1, or);
        return pick + notPick;
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for(int i: nums)
            maxOr |= i;
        return countMaxOrSubsets(nums, maxOr, 0, 0);
    }
}