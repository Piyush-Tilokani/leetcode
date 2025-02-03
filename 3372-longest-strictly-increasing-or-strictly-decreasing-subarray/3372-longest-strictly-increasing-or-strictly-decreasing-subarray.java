class Solution {
    //Approach: Use sliding window to check longest increasing and decreasing subarray
    //Return the max length
    //TC: O(n), SC: O(1)

    //Helper sliding window function for max increasing and decreasing length subarray
    private int helper(int [] nums, boolean inc){
        int l=0;
        int r=0;
        int n=nums.length;
        int ans=0;
        while(r<n){
            while(inc && r+1<n && nums[r]<nums[r+1]){ //For checking increasing subarray
                r++;
            }
            while(!inc && r+1<n && nums[r]>nums[r+1]){ //For checking decreasing subarray
                r++;
            }
            r++; //right pointer increment for outer while loop
            ans=Math.max(ans, r-l); //Update ans
            // System.out.println("Inc: "+inc+", l: "+l+", r: "+r);
            while(r+1<n && nums[r]==nums[r+1]){ //To tackle repeating values at nums[r] Ex: [1,4,3,3,2]
                r++;
            }
            l=r; //Update left pointer
        }
        return ans;
    }
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1)
            return 1;
        int inc=helper(nums, true); //For increasing subarray
        int dec=helper(nums, false); //For decreasing subarray
        return Math.max(inc, dec); //Return max length
    }
}