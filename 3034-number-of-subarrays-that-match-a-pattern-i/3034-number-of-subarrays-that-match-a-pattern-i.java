class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0;
        int n = nums.length;
        int m = pattern.length;        
        for(int i=0; i<n-m; i++){
            int countTemp = 0;
            for(int j=0; j<m; j++){
                if(nums[i+1+j] > nums[i+j] && pattern[j] == 1) countTemp+=1;
                else if(nums[i+1+j] < nums[i+j] && pattern[j] == -1) countTemp+=1;
                else if(nums[i+1+j] == nums[i+j] && pattern[j] == 0) countTemp+=1;
                else break;
            }
            if(countTemp == m)
                    count++;
        }
        return count;
    }
}