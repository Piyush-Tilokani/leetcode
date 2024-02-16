class Solution {
    private boolean isTriangle(int highest, int mid, int lowest){
        if(mid+lowest<=highest)
            return false;
        return true;
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>1; i--){
            if(isTriangle(nums[i], nums[i-1], nums[i-2])){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}