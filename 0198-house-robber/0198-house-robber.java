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
    //TC: O(n), SC: O(n) + O(n) (Stack space for recursion)

    // private int rob(int [] nums, int i, int [] dp){
    //     if(i<0)
    //         return 0;
    //     if(dp[i]!=-1)
    //         return dp[i];
    //     int pick=nums[i]+rob(nums, i-2, dp);
    //     int notPick=rob(nums, i-1, dp);
    //     dp[i]=Math.max(pick, notPick);
    //     return dp[i];
    // }


   

    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        // Arrays.fill(dp, -1);

        //Bottom-up dp (Tabulation)
        //TC: O(n), SC: O(n) (Stack space reduced)
        dp[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            int pick=nums[i];
            if(i>1)
                pick+=dp[i-2];
            int notPick=dp[i-1];
            dp[i]=Math.max(pick, notPick);
        }
        return dp[nums.length-1];


        //Bottom-up dp with space optimization (Tabulation)
        //TC: O(n), SC: O(1)
    }
}