class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minPreSum=0;
        int maxPreSum=0;
        int pre=0;
        for(int i: nums){
            pre+=i;
            minPreSum=Math.min(minPreSum, pre);
            maxPreSum=Math.max(maxPreSum, pre);
        }
        return maxPreSum-minPreSum;
    }
}