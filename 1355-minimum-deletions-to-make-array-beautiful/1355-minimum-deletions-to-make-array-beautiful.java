class Solution {
    public int minDeletion(int[] nums) {
        //Approach: 2 pointer simulation
        //TC: O(n), SC: O(1)
        if(nums.length==1)
            return 1;
        int ans=0;
        int l=0;
        int r=1;
        while(l<nums.length){
            while(r<nums.length && nums[l]==nums[r]){
                ans++;
                r++;
            }
            if(r>=nums.length)
                ans++;
            // if(l<nums.length && r<nums.length)
            // System.out.println("l: "+nums[l]+", r: "+nums[r] +", ind: "+l+", "+r);
            l=r+1;
            r=l+1;
        }
        return ans;
    }
}