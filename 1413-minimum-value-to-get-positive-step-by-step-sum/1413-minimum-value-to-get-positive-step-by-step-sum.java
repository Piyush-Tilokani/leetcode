class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        int min = 100000;
        for(int i: nums)
            if(i<min)
                min = i;
        if(min < 0)
            return (-1*min)+1;
        return 1;
    }
}