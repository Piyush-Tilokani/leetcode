class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length;i++){
            if(max<i)           //If the max is less than the current point,                       
                return false;   //it means we can never reach the current point  
            max=Math.max(max, i+nums[i]); //Max is the max we can reach 
        }
        return true;
    }
}