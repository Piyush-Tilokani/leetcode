class Solution {
    public int longestSubarray(int[] nums) {
        //Approach: The largest AND sub-array needs to have the larges element in the array
        //So the largest required subaaray is largest sequence of 'max' valued numbers"
        int max=0;
        for(int i: nums) //Get the max element
            max=Math.max(max, i);
        int ans = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                int j=i+1;
                while(j<nums.length && nums[j]==max) //Find the longest sequence of max elements
                    j++;
                ans=Math.max(ans, j-i);
                i=j-1;
            }
        }
        return ans;
    }
}