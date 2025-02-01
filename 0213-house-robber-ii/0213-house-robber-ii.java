class Solution {
    public int rob(int[] nums) {
        // Ref: https://www.youtube.com/watch?v=3WaxQMELSkw&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=7 & https://leetcode.com/problems/house-robber/description/

        //Bottom-up dp with space optimization (Tabulation)
        //TC: O(n), SC: O(1)

        int n=nums.length;
        if(n==1)
            return nums[0];

        //For array [0, 1, 2, ...n-2]
        int prev=nums[0];
        int prev2=0;
        for(int i=1; i<n-1; i++){
            int pick=nums[i];
            if(i>1)
                pick+=prev2;
            int notPick=prev;
            int curr=Math.max(pick, notPick);
            prev2=prev;
            prev=curr;
        }
        
        
        //For array [1, 2, 3, ...n-1]
        int prevv=nums[1];
        int prevv2=0;
        for(int i=2; i<n; i++){
            int pick=nums[i];
            if(i>2)
                pick+=prevv2;
            int notPick=prevv;
            int curr=Math.max(pick, notPick);
            prevv2=prevv;
            prevv=curr;
        }
        return Math.max(prev, prevv);
    }
}