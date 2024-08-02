class Solution {
    public int minSwaps(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int i: nums)
            sum+=i;
        int r=0;
        int windowSum=0;
        for(int l=0; l<nums.length; l++){
            while(r-l<sum){
                windowSum += nums[r++%nums.length];
                // System.out.println("l: "+l+", r: "+r%nums.length);
            }
            // System.out.println("winSum: "+windowSum);
            ans=Math.min(ans, sum-windowSum);
            windowSum-=nums[l];
        }
        // System.out.println(sum);
        return ans;
    }
}