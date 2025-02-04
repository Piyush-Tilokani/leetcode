class Solution {
    //Using the helper function from https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
     private int helper(int [] nums){
        int l=0;
        int r=0;
        int n=nums.length;
        int ans=0;
        while(r<n){
            int sum=nums[r];
            while(r+1<n && nums[r]<nums[r+1]){ //For checking increasing subarray
                sum+=nums[r+1];
                r++;
            }
            r++; //right pointer increment for outer while loop
            ans=Math.max(ans, sum); //Update ans
            // System.out.println("Inc: "+inc+", l: "+l+", r: "+r);
            while(r+1<n && nums[r]==nums[r+1]){ //To tackle repeating values at nums[r] Ex: [1,4,3,3,2]
                r++;
            }
            l=r; //Update left pointer
        }
        return ans;
    }
    public int maxAscendingSum(int[] nums) {
        if(nums.length==1)
            return nums[0]; 
        return helper(nums);
    }
}