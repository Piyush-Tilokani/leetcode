class Solution {
    public int findMin(int[] nums) {
        int l=0; 
        int r=nums.length-1;
        while(l<=r){
            int m=l+((r-l)/2);
            if(m<nums.length-1 && nums[m]>nums[m+1])
                return nums[m+1];
            if(m>0 && nums[m-1]>nums[m])
                return nums[m];
            else{
                if(nums[l]<=nums[m] && nums[m]<=nums[r])
                    return nums[l];
                if(nums[l]<=nums[m] && nums[m]>nums[r])
                    l=m+1;
                else if(nums[l]>nums[r])
                    r=m-1;
            }
            // System.out.println("Before exiting the loop...");
            // System.out.println("l: "+l+", r: "+r+", m: "+m);
        }
        return 0;
    }
}