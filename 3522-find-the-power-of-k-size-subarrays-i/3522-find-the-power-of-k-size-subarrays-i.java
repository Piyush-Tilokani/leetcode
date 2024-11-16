class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        for(int i=0; i<ans.length; i++){
            int isSorted = 1;
            for(int j=i; j<i+k-1; j++){
                if(nums[j]+1!=nums[j+1]){
                    isSorted=0;
                    break;
                }
            }
            if(isSorted==1)
                ans[i] = nums[i+k-1];
            else
                ans[i] = -1;
        }
        return ans;
    }
}