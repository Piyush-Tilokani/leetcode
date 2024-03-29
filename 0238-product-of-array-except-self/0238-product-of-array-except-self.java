class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0, prod=1; i<nums.length; i++){
            ans[i] = prod;
            prod *= nums[i];
        }
        for(int i= nums.length-1, prod=1; i>=0; i--){
            ans[i] *= prod;
            prod *= nums[i];
        }
        return ans;
    }
}