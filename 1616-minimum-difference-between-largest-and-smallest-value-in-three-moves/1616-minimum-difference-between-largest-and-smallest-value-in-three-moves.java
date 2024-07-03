class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4)
            return 0;
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<4; i++){ //Only 4 possible cases (Remove first 3 AND none from last), Remove(Last 3 AND none from first), (Remove first 2 AND 1 from last), (Remove 1 from first AND 2 from last) 
            int min=nums[i];
            int max=nums[nums.length-1-3+i];
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}