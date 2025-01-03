class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans=0;
        int sum=0;
        int prefix=0;
        for(int i: nums)
            sum+=i;
        for(int i=0; i<nums.length-1; i++){
            prefix+=nums[i];
            if(prefix>=sum-prefix)
                ans++;
        }
        System.out.println(sum);
        return ans;
    }
}