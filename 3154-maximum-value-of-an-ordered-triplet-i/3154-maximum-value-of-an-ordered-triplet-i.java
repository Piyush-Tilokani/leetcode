class Solution {
    public long maximumTripletValue(int[] nums) {
        // int n=nums.length;
        long ans=0;
        long diff=0;
        long max=0;
        for(int i: nums){
            ans=Math.max(ans, diff * i);
            diff = Math.max(diff, max-i);
            max=Math.max(max, i);
        }
        return ans;
    }
}