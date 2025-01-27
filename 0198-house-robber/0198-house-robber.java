class Solution {
    //Normal recursion

    // private int rob(int []nums, int i){
        // if(i<0)
        //     return 0;
        // int pick = nums[i];
        // if(i>1)
        //     pick+=rob(nums, i-2);
        // int notPick = rob(nums, i-1);
        // return Math.max(pick, notPick);
    // }

    //Topdown dp (Memoization)

    private int rob(int [] nums, int i, int [] dp){
        if(i<0)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int pick=nums[i]+rob(nums, i-2, dp);
        int notPick=rob(nums, i-1, dp);
        dp[i]=Math.max(pick, notPick);
        return dp[i];
    }

    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp, -1);
        return rob(nums, nums.length-1, dp);
    }
}