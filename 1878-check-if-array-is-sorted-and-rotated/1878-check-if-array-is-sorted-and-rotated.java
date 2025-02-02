class Solution {
    public boolean check(int[] nums) {
        //Approach: Editorial Approach 3: A rotated array is pivoted at only one single index
        //Therefore, there cannot be more than 1 inversion index
        //TC: O(n), SC: O(1)

        int inversions=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1])
                inversions++;
        }
        if(nums[nums.length-1]>nums[0])
            inversions++;
        return inversions<=1;
    }
}