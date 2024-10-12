class Solution {
    public int maxWidthRamp(int[] nums) {
        //Brute force: TC: O(n^2), SC: O(1)
        // TLE
        // int ans=0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[j]>=nums[i])
        //             ans=Math.max(ans, j-i);
        //     }
        // }
        // return ans;

        // Optimal: TC: O(n), SC: O(n)
        // Sliding window with maxRight preprocessing
        int ans=0;
        int []maxRight = new int[nums.length];
        int max=0;
        for(int i=nums.length-1; i>=0; i--)       {
            max=Math.max(max, nums[i]);
            maxRight[i] = max;
        }
        // System.out.println(Arrays.toString(maxRight));
        int l=0;
        int r=1;
        while(r<nums.length){
            while(l<nums.length && r<nums.length && nums[l]<=maxRight[r]){
                r++;
            }
            l++;
            ans=Math.max(ans, r-l);
        }
        return ans;
    }   
}