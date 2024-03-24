class Solution {
    public int findDuplicate(int[] nums) {
        //Cyclic sort (2 Passes)
        // int i = 0;
        // while(i<nums.length){
        //     int correct = nums[i] - 1;
        //     if(nums[i] != nums[correct]){
        //         int temp = nums[i];
        //         nums[i] = nums[correct];
        //         nums[correct] = temp;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // for(i = 0; i<nums.length; i++){
        //     if(nums[i] != i+1)
        //         return nums[i];
        // }
        
        // return nums[0];

        //Already seen number (1 Pass)
        int seen[] = new int[nums.length];
        for(int i: nums){
            if(seen[i-1]==1)
                return i;
            seen[i-1]++;
        }
        return -1;
    }
}