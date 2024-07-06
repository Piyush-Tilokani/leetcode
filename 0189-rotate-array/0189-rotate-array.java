class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0 || k%nums.length==0)
            return;
        //Copying into new array
        //TC: O(n), SC: O(n)
        int copy[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            copy[(i+k)%nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++)
            nums[i] = copy[i];
    }
}