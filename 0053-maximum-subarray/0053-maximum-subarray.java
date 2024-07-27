class Solution {
    public int maxSubArray(int[] nums) {
        //ISS Interview Question
        //Approach: Kadane’s Algorithm. TC: O(n), SC: O(1)
        int ans = Integer.MIN_VALUE;
        int pre = 0;
        for(int i=0; i<nums.length; i++){
            pre += nums[i];
            ans=Math.max(pre, ans);
            if(pre<0)
                pre=0;
        }
        return ans;
    }
}