class Solution {
    public int longestSubarray(int[] nums) {
        //Approach: The largest AND sub-array needs to have the larges element in the array
        //So the largest required subaaray is largest sequence of 'max' valued numbers"
        int max = 0;
        int ans = 0;
        int count = 0;
        for(int i: nums){
            if(i>max){ //New max found
                max=i; 
                ans=0; 
                count=0;
            }
            if(i==max)
                count++;
            else
                count=0;
            ans=Math.max(ans, count);
        }
        return ans;
    }
}